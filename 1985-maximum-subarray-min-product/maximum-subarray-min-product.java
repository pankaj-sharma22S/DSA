class Solution {
    public int maxSumMinProduct(int[] nums) {
        
        int n=nums.length;
        long[]sub=new long[n+1];
        Stack<Integer> s=new Stack<>();
        sub[0]=0;
        int k=1;
        for(int i=0; i<n; i++){
            sub[i+1]=nums[i]+sub[i];
        }
        long ans=0;
        for(int i=0; i<=n; i++){
            int temp=(i==n)?0:nums[i];
            while(!s.isEmpty()&&nums[s.peek()]>=temp){
                int idx=s.pop();
                int right=i;
                int left=(s.isEmpty())?0:s.peek()+1;
                long sum=sub[right]-sub[left];
            
                ans=Math.max(ans,sum*nums[idx]);

            }
            if(i<n){
            s.push(i);
            }
        }return (int)  (ans%1000000007);
    }
}