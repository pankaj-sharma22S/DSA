class Solution {
    void perm(int[]nums,List<List<Integer>> ans,List<Integer> curr,boolean[]seen){
        if(curr.size()==nums.length){
            ans.add(new ArrayList<>(curr));
        }
        
        for(int i=0; i<nums.length; i++){
            if(seen[i]) continue;
            seen[i]=true;
            curr.add(nums[i]);
            perm(nums,ans,curr,seen);
            curr.remove(curr.size()-1);
            seen[i]=false;

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        boolean[]seen=new boolean[nums.length];
        perm(nums,ans,curr,seen);
    return ans;
    }
}