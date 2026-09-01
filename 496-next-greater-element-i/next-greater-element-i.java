class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        Map<Integer,Integer> map=new HashMap<>();
        int []res=new int[nums1.length];
        int k=0;
        for(int i=nums2.length-1; i>=0; i--){
           
            while(!s.isEmpty() && nums2[s.peek()]<=nums2[i]){
            
                s.pop();
            }
           if(!s.isEmpty()){
            if(nums2[s.peek()]>nums2[i]){
            int idx=s.peek();
            map.put(nums2[i],nums2[idx]);
            }
           
           }
        
            
            s.push(i);
        }
        
        for(int num:nums1){
           res[k++]=map.getOrDefault(num,-1); 
        }
      
        return res;
    }
}