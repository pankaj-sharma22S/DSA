class Solution {
    public boolean check(int n){
        int count=0;
        if(n<10){
            return false;
        }
     else{   while(n!=0){
            n=n/10;
            count++;
        }
        if(count%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    }
    public int findNumbers(int[] nums) {
     int ans=0;
     for(int i=0; i<nums.length; i++){
        if(check(nums[i])){
            ans++;
        }
     }   
     return ans;
    }
}