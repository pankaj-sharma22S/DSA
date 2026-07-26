class Solution {
    public long gcdSum(int[] nums) {
        int []prefix=new int[nums.length];
        int mx=Integer.MIN_VALUE;
        int j=0;
        for(int i=0; i<nums.length; i++){
            mx=Math.max(nums[i],mx);
            int b=mx;
            int a=nums[i];
            while(a!=0){
                int temp=a;
                a=b%a;
                b=temp;
            }
            prefix[j++]=b;
        }
        Arrays.sort(prefix);
        long ans=0;
        int m=0;
        int k=prefix.length-1;
        while(m<k){
            int a=prefix[m];
            int b=prefix[k];
            while(a!=0){
                int temp=a;
                a=b%a;
                b=temp;
            }
            ans+=b;
            m++;
            k--;
        }
        return ans;
    }
}