class Solution {
    void backtrack(int n, int st,int end,String curr,List<String> ans){
        if(curr.length()==2*n){
            ans.add(curr);
            return;
        }
        if(st<n){
         backtrack(n,st+1,end,curr+"(",ans);   
        }
        if(end<st){
         backtrack(n,st,end+1,curr+")",ans);   
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        backtrack(n,0,0,"",ans);
        return ans;
    }
}