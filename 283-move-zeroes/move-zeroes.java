class Solution {
    public void moveZeroes(int[] nums) {
     int k=0;
     for(int num:nums){
        if(num!=0){
            nums[k++]=num;
        }
     }   
     for(int i=k; i<nums.length; i++){
        nums[i]=0;
     }
     
    }
}