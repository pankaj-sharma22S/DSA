class Solution {
    public int maximumProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int ans1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int ans2=nums[0]*nums[1]*nums[nums.length-1];
        max=Math.max(max,ans1);
        max=Math.max(max,ans2);
    return max;
      
    }
}