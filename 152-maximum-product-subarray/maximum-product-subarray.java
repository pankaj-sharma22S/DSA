class Solution {
    public int maxProduct(int[] nums) {
      int maxprod=nums[0];
      int prod=1;
      for(int i=0; i<nums.length; i++){
        prod=prod*nums[i];
         if(prod==0){
             maxprod=Math.max(maxprod,prod);
            prod=1;
            continue;
            
        }
        maxprod=Math.max(maxprod,prod);
      }  
      prod=1;
      for(int i=nums.length-1; i>=0; i--){
        prod=prod*nums[i];
         if(prod==0){
            maxprod=Math.max(maxprod,prod);
            prod=1;
            continue;
            
            
        }
        maxprod=Math.max(maxprod,prod);
      }  
      return maxprod;
    }
}