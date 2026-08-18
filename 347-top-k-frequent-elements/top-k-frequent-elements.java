class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                 map.put(nums[i],1);
            }
        
        }
        for(int key:map.keySet()){
             list.add(key);
        }
        list.sort((a, b) -> map.get(b) - map.get(a));
        int[]arr=new int[k];
        for(int i=0; i<k; i++){
          arr[i]=list.get(i);
        }
       
        return arr; 
        

    }
}