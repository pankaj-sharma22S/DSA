class Solution {
    public int arrayNesting(int[] nums) {
        int ans=0;
        boolean[] isvis=new boolean[nums.length];
        int count=0;
        for(int i=0; i<nums.length; i++){
            int a=i;
           if(isvis[i]){
            continue;
           }
            count=0;
            while(!isvis[a]){
               
                isvis[a]=true;
                a=nums[a];
                count++;

            }
            ans=Math.max(ans,count);
        }
    return ans;

    }
}