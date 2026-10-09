class Solution {
    void helper(List<List<Integer>> res,int k, int n,List<Integer> ans,int sum,int start){
            if(ans.size()==k){
                if(sum==0){
                res.add(new ArrayList<>(ans));
                }
                return;
            }
            for(int i=start; i<10; i++){
              ans.add(i);
              helper(res,k,n,ans,sum-i,i+1);
              ans.remove(ans.size()-1);
              

            }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
     
        int sum=n;
        helper(res,k,n,ans,sum,1);
        return res;
    }
}