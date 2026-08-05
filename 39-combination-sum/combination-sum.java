class Solution {
    void backtracking(int []cand,int target, List<List<Integer>> ans,List<Integer>curr,int index){
        
        if(target==0){
            ans.add((new ArrayList<>(curr)));
            return;
        }
        else if(target<0){
            return;
        }
        for(int i=index; i<cand.length; i++){
            curr.add(cand[i]);
            backtracking(cand,target-cand[i],ans,curr,i);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
         List<Integer>curr=new ArrayList<>();
        backtracking(candidates,target,ans,curr,0);
        return ans;   
    }
}