class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans=Integer.MIN_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        int dup=0;
        long sum=0;
        for(int i=0; i<k; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>1){
                dup++;
            }
            sum+=nums[i];
        }
        if(dup==0){
            ans=Math.max(ans,sum);
        }
        for(int i=k; i<nums.length; i++){
            int val=nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            if(map.get(nums[i])>1){
                dup++;
            }
            sum+=nums[i];
            int d=(map.get(nums[i-k]));
            if(d>1){
                dup--;
            }
            map.put(nums[i-k],map.getOrDefault(nums[i-k],0)-1);
            sum-=nums[i-k];
             if(dup==0){
            ans=Math.max(ans,sum);
        }
        }
        return ans==Integer.MIN_VALUE?0:ans;
    }
}