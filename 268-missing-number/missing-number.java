class Solution {
    public int missingNumber(int[] nums) {
       
       int m=nums.length;
        int total=0;
        int sum=0;

        for(int i=0; i<=m; i++){
             total+=i;
        }
        for(int i=0; i<m; i++){
             sum+=nums[i];
        }
            
        return total-sum;
    }
}