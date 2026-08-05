class Solution {
    public boolean isHappy(int n) {
       
       HashSet<Integer> seen=new HashSet<>();
        while(n!=1&&!seen.contains(n)){
            int sum=0;
            int ans=n;
            seen.add(n);
            while(ans!=0){
                int digit=ans%10;
                sum+=digit*digit;
                ans=ans/10;
            }
            n=sum;
        }   
        return n==1;
    }
}