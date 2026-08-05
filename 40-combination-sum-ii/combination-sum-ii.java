class Solution {
    void back(int[]cand,int index,Set<List<Integer>>ans,List<Integer> curr,int target){

        if(target==0){
            ans.add(new ArrayList<>(curr));
        }
        else if(target<0){
            return;
        }
        for(int i=index; i<cand.length; i++){
        if(i>index && cand[i]==cand[i-1]) {
            continue;
        }
        curr.add(cand[i]);
        back(cand,i+1,ans,curr,target-cand[i]);
        curr.remove(curr.size()-1);
        }
}
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         Arrays.sort(candidates);
        Set<List<Integer>> ans=new HashSet<>();
        List<Integer> curr=new ArrayList<>();
      back(candidates,0,ans,curr,target);
    return new ArrayList<>(ans);
    }
}