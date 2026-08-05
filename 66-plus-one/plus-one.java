class Solution {
    public int[] plusOne(int[] digits) {

    int []arr=new int[digits.length+1];
    int len=digits.length;
        for(int j=len-1; j>=0; j--){
         if(digits[j]<9){
            digits[j]++;
            return digits;
         }   
         else{
            digits[j]=0;
            
         }
        }
        arr[0]=1;
    return arr;


    }
}