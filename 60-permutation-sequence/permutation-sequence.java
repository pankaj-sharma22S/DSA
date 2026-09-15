class Solution {
    int count=0;
    String ans="";
    void perm(int n,int k,String str,boolean[]used){
        if(str.length()==n){
            count++;
        if(count==k){
            ans=str;
            return;
        }
        }
        for(int i=1; i<=n; i++){
            if(used[i]) continue;
            used[i]=true;
            perm(n,k,str+i,used);
            used[i]=false;
        }
    }
    public String getPermutation(int n, int k) {
        boolean[]used=new boolean[n+1];
        perm(n,k,"",used);
        return ans;
            }
}