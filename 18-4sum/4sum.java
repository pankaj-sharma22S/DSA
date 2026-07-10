class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        
        Set<List<Integer>> ans=new HashSet<>(); 
        for(int i=0; i<nums.length; i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            int one=nums[i];
            for(int j=i+1; j<nums.length; j++){
            if(j>i+1&&nums[j]==nums[j-1])continue;
                int sec=nums[j];
            int st=j+1;
            int end=nums.length-1;
            while(st<end){
                List<Integer> list=new ArrayList<>();
                long sum=(long)one+sec+nums[st]+nums[end];
                if(sum==target){
                list.add(one);
                list.add(sec);
                list.add(nums[st++]);
                list.add(nums[end--]);
                Collections.sort(list);
                ans.add(list);
                
                 while(st<end&&nums[st]==nums[st-1]){
                    st++;
                 }
                  while(st<end&&nums[end]==nums[end+1]){
                    end--;
                 }
                }
                else if(target>sum){
                      st++;
                }
                else {
                    end--;
                }
            }
            }
        }
     return new ArrayList<>(ans);
    }
}