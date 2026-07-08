// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         int target=0;
//         Set<List<Integer>> list=new HashSet<>();
//         for(int i=0; i<nums.length; i++){
//              target=-nums[i];
//             HashSet<Integer> h=new HashSet<>();

//             for(int k=i+1; k<nums.length; k++){
//                  int third=target-nums[k];
//                  if(h.contains(third)){
//                     List<Integer> temp = new ArrayList<>();
//                     temp.add(nums[i]);
//                     temp.add(nums[k]);
//                     temp.add(third);
//                     Collections.sort(temp);
//                     list.add(temp);
//                  }
//                  h.add(nums[k]);
//             }    
//         }
//        return new ArrayList<>(list);
    
//     }
// }
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target=0;
        Arrays.sort(nums);
        Set<List<Integer>> list=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(i>0&& nums[i]==nums[i-1]) continue;
            int one=nums[i];
            int st=i+1;
            int end=nums.length-1;
           
            while(st<end){
                if(one+nums[st]+nums[end]==target){
                 List<Integer> temp = new ArrayList<>();
                    temp.add(one);
                    temp.add(nums[st]);
                    temp.add(nums[end]);
                    
                    Collections.sort(temp);
                   list.add(temp);
                   st++;
                   end--;
                }
                while(st<end&&one+nums[st]+nums[end]<target){
                    st++;
                }
                 while(st<end&&one+nums[st]+nums[end]>target){
                    end--;
                }

            }



        }
        return new ArrayList<>(list);
    
    }
}