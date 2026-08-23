class Solution {
    public int pivotIndex(int[] nums) {
        int rightsum=0;
        int leftsum=0;
        for(int i=0; i<nums.length; i++){
            rightsum+=nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(leftsum==(rightsum-nums[i])){
                return i;
            }
            else{
                leftsum+=nums[i];
                rightsum-=nums[i];
            }
        }
        return -1;
    }
}