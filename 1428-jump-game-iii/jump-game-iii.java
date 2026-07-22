class Solution {
    private boolean reachdfs(int arr[],int start){
       
        if(start>arr.length-1 ||start<0|| arr[start]==-1){
        return false;
    }
    if(arr[start]==0){
        return true;
    }
    int jump= arr[start];
    arr[start]=-1;
    return reachdfs(arr,start-jump)||reachdfs(arr,start+jump);
    }
    public boolean canReach(int[] arr, int start) {
     return reachdfs(arr,start);
 
    }
}