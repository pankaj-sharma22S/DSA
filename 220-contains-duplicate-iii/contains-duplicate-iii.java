class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
       
        TreeSet<Integer> set=new TreeSet<>();
        set.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(i>indexDiff){
            set.remove(nums[i-indexDiff-1]);
            }
            int n=nums[i];
            Integer cv=set.ceiling(n);
            Integer fv=set.floor(n);
            if(cv!=null && Math.abs(n-cv)<=valueDiff){
                return true;
            }
           else if(fv!=null && Math.abs(n-fv)<=valueDiff){
                return true;
            }
            
            set.add(n);
        }
        return false;
    }
}