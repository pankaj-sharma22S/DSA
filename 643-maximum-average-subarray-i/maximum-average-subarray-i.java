class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=Integer.MIN_VALUE;
        double sum=0;
        for(int i=0; i<k; i++){
                sum+=nums[i];
                // System.out.println(sum);
        }
        ans=Math.max(ans,sum);
        for(int j=k; j<nums.length; j++){
            sum+=nums[j];
            sum-=nums[j-k];
            ans=Math.max(ans,sum);

        }


        return ans/k;
    }
}