class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closest=nums[0]+nums[1]+nums[2];
        for(int i=0; i<nums.length; i++){
            
            if(i>0&&nums[i]==nums[i-1]) continue;
            int one=nums[i];
            int st=i+1;
            int end=nums.length-1;
            while(st<end){
                int sum=one+nums[st]+nums[end];
                 if(Math.abs(sum-target)<Math.abs(closest-target)){
                    closest=sum;
                }
                if(sum<target){
                    st++;
                }
                else if(sum>target){
                    end--;
                }
                else{
                    return sum;
                }

            }

        }
        return closest;
    }
}