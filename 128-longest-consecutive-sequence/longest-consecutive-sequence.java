class Solution {
    public int longestConsecutive(int[] nums) {
  
     HashSet<Integer> set=new HashSet<>();
    int ans=Integer.MIN_VALUE;
    if(nums.length==0){
        return 0;
    }
    for(int i=0; i<nums.length; i++){
        set.add(nums[i]);
     }  
      for(int n:set){

        if(!set.contains(n-1)){
            int x=n;
             int count=1;
            while(set.contains(x+1)){
                count++;
                x++;
            }
            ans=Math.max(ans,count);
        }
       
      }
      return ans;
    }
}