class Solution {
    void helper(int[]nums,int idx,List<List<Integer>> res,List<Integer> ans){
        res.add(new ArrayList<>(ans));
        for(int i=idx; i<nums.length; i++){
            ans.add(nums[i]);
            helper(nums,i+1,res,ans);
            ans.remove(ans.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        helper(nums,0,res,ans);
        return res;
    }
}