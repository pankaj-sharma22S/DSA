class Solution {
    public int sumSubarrayMins(int[] arr) {
         long sum=0;
         int mod = 1000000007;
         int n=arr.length;
         Stack<Integer> s=new Stack<>();
        for(int i=0; i<=n; i++){
        while(!s.isEmpty()&& (i==n||arr[s.peek()]>=arr[i])){
            int idx=s.pop();
            int left;
            if(!s.isEmpty()){
                left=s.peek();
            }
            else{
                left=-1;
            }
           long leftcount=idx-left;
           long rightcount=i -idx;
            sum=(sum+((long)leftcount*rightcount*arr[idx])%mod)%mod;
           }
            if(i<n){
                s.push(i);
            }
            
        }
        
        return (int)sum;
    }
}