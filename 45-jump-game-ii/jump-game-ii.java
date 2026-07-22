class Solution {
    public int jump(int[] nums) {
    int curr=0;
    int currend=0;
    if(nums.length<=1){
        return 0;
    }
    int jumps=0;
    for(int i=0; i<nums.length-1; i++){
      
        curr=Math.max(curr,nums[i]+i);
        System.out.println(curr);
        if(i==currend){
            jumps++;
            currend= curr;
        }

     }
     return jumps;   
    }
}