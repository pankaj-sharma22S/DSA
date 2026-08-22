class Solution {
    public void duplicateZeros(int[] arr) {
     int []dup=new int[arr.length];
     int k=0;
     int i=0;
     while(k<arr.length&& i<arr.length){
        if(arr[i]==0){
            dup[k++]=0;
            if(k<arr.length){
            dup[k++]=0;
            }
        }
        else{
            dup[k++]=arr[i];
        }
        i++;
     }   
     for(int r=0; r<dup.length;r++){
        arr[r]=dup[r];
     }
    }
}