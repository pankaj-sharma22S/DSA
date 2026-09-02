class Solution {
    public long subArrayRanges(int[] nums) {
     Stack<Integer> s=new Stack<>();
     Stack<Integer> s2=new Stack<>();

     long sum1=0;
     long sum2=0;
    int n=nums.length;
     for(int i=0; i<=nums.length; i++){
        
        while(!s.isEmpty()&& (i==n||nums[s.peek()]>nums[i])){
            int idx=s.pop();
            int left=idx-(s.isEmpty()?-1:s.peek());
            int right=i-idx;
            sum1+=(long)left*right*nums[idx];
        }
         while(!s2.isEmpty()&& (i==n||nums[s2.peek()]<nums[i])){
            int idx=s2.pop();
            int left=idx-(s2.isEmpty()?-1:s2.peek());
            int right=i-idx;
            sum2+=(long)left*right*nums[idx];
        }
        if(i<nums.length){
     s.push(i);
    s2.push(i);
     }   
     }
     return (sum2-sum1);
    }
}