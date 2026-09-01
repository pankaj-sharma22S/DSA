class Solution {
    public int[] nextGreaterElements(int[] nums) {
      int[]ans=new int[nums.length];
      HashMap<Integer,Integer> map=new HashMap<>();
      Stack<Integer> s=new Stack<>();
      int k=0;
      int id;
      int n=nums.length;
      for(int i=2*n-1; i>=0; i--){
        id=i%n;
        while(!s.isEmpty()&& nums[s.peek()]<=nums[id]){
            s.pop();
        }
        if(!s.isEmpty()&& i<n){
            int idx=s.peek(); 
            
            map.put(id,nums[idx]);
        
        }
        
        s.push(id);
      }
      for(int j=0; j<nums.length; j++){
        ans[k++]=map.getOrDefault(j,-1);
      }
      return ans;
    }
}