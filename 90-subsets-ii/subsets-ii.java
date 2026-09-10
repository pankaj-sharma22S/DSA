class Solution {
     void helper(int[]nums,int idx,List<Integer> ans,Set<List<Integer>> res){
        Arrays.sort(nums);
        res.add(new ArrayList<>(ans));
        for(int i=idx; i<nums.length; i++){
            if(i>idx && nums[i]==nums[i-1]){
                continue;
            }
            ans.add(nums[i]);
            helper(nums,i+1,ans,res);
            ans.remove(ans.size()-1);
        }
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        helper(nums,0,ans,res);
        return new ArrayList<>(res);

    }
}