class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length<=1){
            return true;
        }
        int curr=nums[0];
        for(int i=0; i<nums.length; i++){
            if(i>curr){
                return false;
            }
            curr=Math.max(curr,nums[i]+i);
            if(curr>=nums.length-1){
                return true;
            }
        }
        return true;
    }
}