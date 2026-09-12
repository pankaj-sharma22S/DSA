class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
     
     List<int[]> list=new ArrayList<>();
     for(int i=0; i<intervals.length; i++){
        list.add(intervals[i]);
     } 
     int count=0;
        int []l1;
        int []l2;

      for(int i=0; i<intervals.length; i++){
       int flag=1;
        l1=intervals[i];
        for(int j=0; j<intervals.length; j++){
            
             l2=intervals[j];
            if(i!=j && l1[0]>=l2[0] && l1[1]<=l2[1]){
                flag=0;
                break;

            } 
        }
        if(flag==1){
        count++;
        }
    }
    return count;
    }
}