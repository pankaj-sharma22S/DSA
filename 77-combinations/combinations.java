class Solution {
    void helper(int st,int n, int k,List<List<Integer>> res,List<Integer> ans){
        
        if(ans.size()==k){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=st; i<=n; i++){
            ans.add(i);
            helper(i+1,n,k,res,ans);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        helper(1,n,k,res,ans);
        return res;
    }
}