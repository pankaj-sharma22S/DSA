class Solution {
    public int[] twoSum(int[] nums, int target) {
        int []arr=new int[2];
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                arr[0]=map.getOrDefault(target-nums[i],0);
                arr[1]=i;
                break;
            }
            else{
                map.put(nums[i],i);
            }
        }
        return arr;
    }
}