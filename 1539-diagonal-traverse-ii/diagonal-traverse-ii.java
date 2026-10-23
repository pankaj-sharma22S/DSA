class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
      HashMap<Integer,List<Integer>> map=new HashMap<>();
      int n=nums.size();
      int total=0;
      for(int i=0; i<n; i++){
        total+=nums.get(i).size();
      }
      int m=nums.get(0).size(); 
      int[] ans=new int[total];
      int maxdia=0;
      for(int i=0; i<n; i++){
        for(int j=0; j< nums.get(i).size(); j++){
            int dia=i+j;
            maxdia=Math.max(maxdia,dia);
            map.putIfAbsent(dia,new ArrayList<>());
            map.get(dia).add(nums.get(i).get(j));
        }
      }  
      int idx=0;
      for(int k=0; k<=maxdia; k++){
        List<Integer> list=map.get(k);
        for(int i=list.size()-1; i>=0; i-- ){
            ans[idx++]=list.get(i);
        }
      }
      return ans;
    }
}
