class Solution {
    public void swap(int []nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
     public void reverse(int []nums,int i,int j){
       while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
        }
     }
    
        public void nextPermutation(int[] nums) {
        // varun will do it in 2027
        // making more brothers of parth.
        // dhanesh kholi blackia is missing u.
        // .you will meet your kholi father in 2030.
        int n=nums.length;
        int i=n-2;
        while(i>=0 &&nums[i]>=nums[i+1]){
                i--;
        }
        if(i>=0){
        int j=n-1;
        while(j>=0&&nums[j]<=nums[i]){
            j--;
        }
        swap(nums,i,j);
    }
        reverse(nums,i+1,n-1);
    }
}