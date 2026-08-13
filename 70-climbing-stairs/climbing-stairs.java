class Solution {
    public int climbStairs(int n) {
        if(n<=2){
        return n;
        }
        int p=1;
        int q=2;
        for(int i=3; i<=n; i++ ){
            int curr=p+q;
            p=q;
            q=curr;
        }
        return q;
    }
}