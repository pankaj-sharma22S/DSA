class Solution {
    public int findMaxLength(int[] nums) {
 HashMap<Integer, Integer> h = new HashMap<>();

        h.put(0,-1);
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                sum--;
            }
            else{
                sum++;
            }
            if(h.containsKey(sum)){
                max=Math.max(max,i-h.get(sum));
            }
            else{
                h.put(sum,i);
            }

        } 
        if(max!=Integer.MIN_VALUE){
        return max;
        }
        return 0;
    }
}