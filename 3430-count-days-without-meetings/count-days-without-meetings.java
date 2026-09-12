class Solution {
    public int countDays(int days, int[][] meetings) {
       Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));
       int count=0;
       int end=0;
       for(int i=0; i<meetings.length; i++){
        
        int []l1=meetings[i];
        if(l1[0]>end+1){
            count+=l1[0]-(end+1);
        }
        end=Math.max(end,l1[1]);
       }
        count+=days-end;
       return count;
    }
}