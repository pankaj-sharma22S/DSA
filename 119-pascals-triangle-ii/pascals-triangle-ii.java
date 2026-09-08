class Solution {
    Map<String,Integer> map=new HashMap<>();
    int  helper(int row,int col){
        String key=Integer.toString(row)+" "+Integer.toString(col);
        if(map.containsKey(key)){
            return map.get(key);
        }
        if(row==0||col==0||row==col){
            return 1;
        }

        int ans=helper(row-1,col-1)+helper(row-1,col);
        map.put(key,ans);
        return ans;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        for(int col=0; col<=rowIndex; col++){
            ans.add(helper(rowIndex,col));
        }
        return ans;
    }
}