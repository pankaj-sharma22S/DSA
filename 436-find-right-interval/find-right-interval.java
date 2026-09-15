class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        for(int i=0 ; i<n ;i++){
         int maxidx=-1;
            for(int j=0; j<n; j++){
                if(intervals[j][0]>=intervals[i][1]){
                    if(maxidx==-1){
                    maxidx=j;
                    }
                    if(intervals[j][0]<intervals[maxidx][0]){
                    maxidx=j;

                    }
                }
            }
                if(maxidx!=-1){
                    ans[i]=maxidx;
                }
        }
        return ans;
    }
}