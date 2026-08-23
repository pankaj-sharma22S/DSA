class Solution {
    public int dominantIndex(int[] nums) {
     int max=Integer.MIN_VALUE;
     int Smax=Integer.MIN_VALUE;   
     int idx=-1;
    for(int i=0; i<nums.length; i++){
        if(nums[i]>max){
            Smax=max;
            max=nums[i];
            idx=i;
        }
        else if(max!=Integer.MIN_VALUE && nums[i]>Smax){
            Smax=nums[i];
        }
    }
    if(max>=Smax*2){
        return idx;
    }
    return -1;
    }
}