class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int []ans=new int[nums.length];
        int k=0;
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0 ; j<nums.length; j++){
                if(i!=j){
                    if(nums[j]<nums[i]){
                        count++;
                    }
                }
            }
            ans[k++]=count;
        }
        return ans;
    }
}