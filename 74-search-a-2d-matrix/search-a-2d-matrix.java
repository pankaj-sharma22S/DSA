class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int n2=matrix[0].length;
        int i=0;
        int j=n*n2-1;
        while(i<=j){
            int mid=(i+j)/2;
            int row=mid/n2;
            int col=mid%n2;
            if(matrix[row][col]==target){
                return true;
            }
            
            if(matrix[row][col]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        } 
return false;
    }
}