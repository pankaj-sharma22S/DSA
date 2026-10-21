class Solution {
    Map<Integer,Integer> map=new HashMap<>();
    public int dp(int[] nums,int n){
        if(n==0){
            return nums[0]; 
        }
        if(n==1){
            return Math.max(nums[0],nums[1]);
        }
        if (map.containsKey(n)) {
            return map.get(n);
    }
        map.put(n,Math.max(nums[n]+dp(nums,n-2),dp(nums,n-1)));
        return map.get(n);
    }
    public int rob(int[] nums) {
            return dp(nums,nums.length-1);
    }
}