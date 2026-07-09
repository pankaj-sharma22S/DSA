class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int st=0; 
        int end=nums.length-1;
        int []ans ={-1,-1};
        while(st<=end){
            int mid=st+(end-st)/2;
             if(nums[mid]==target){
                int a=mid;
                int b=mid;
                while(a>0&& nums[a]==nums[a-1]){
                    a--;
                }
                 while(b<nums.length-1&& nums[b]==nums[b+1]){
                    b++;
                }
                   ans[0]=a;
                   ans[1]=b;
                   break;
             }
             else if(target>nums[mid]){
                st=mid+1;
             }
             else if((target<nums[mid])){
                end=mid-1;
             }
            
        }
        return ans;
    }
}