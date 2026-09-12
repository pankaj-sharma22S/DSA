class Solution {
    public boolean isoverlap(int[]int1 ,int[]int2){
        return int1[1]>=int2[0] && int2[1]>=int1[0];
    }
    public int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        for(int []interval:intervals){
            list.add(interval);
        }
        boolean flag=true;

        while(flag){
            flag=false;
        for(int i=0; i<list.size(); i++){
            int j=i+1;
                int[] int1=list.get(i);
            while( j<list.size()){
                int[] int2=list.get(j);
                if(isoverlap(int1,int2)){
                    int1[0]=Math.min(int1[0],int2[0]);
                    int1[1]=Math.max(int1[1],int2[1]);
                    list.remove(j);
                  flag=true;
                }
                else{
                    j=j+1;
                }
            }
            }
        }
        int[][] ans=new int[list.size()][2];
        for(int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}