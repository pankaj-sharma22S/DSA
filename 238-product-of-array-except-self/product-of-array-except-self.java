class Solution {
    public int[] productExceptSelf(int[] nums) {
        int []prefix=new int[nums.length];
        int[]sufix=new int[nums.length];
        int[]ans=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            prefix[i]=prefix[i-1]*nums[i];
        }
        sufix[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--){
            sufix[i]=sufix[i+1]*nums[i];
        }
        for(int i=0; i<nums.length;i++){
            int left=(i==0)?1:prefix[i-1];
            int right=(i==nums.length-1)?1:sufix[i+1];
            ans[i]=left*right;
        }
        return ans;
    }
}