class Solution {
    int count;
      void Helper(char[][]mat,int row,int n){
     
        if(row==n){
            count++;
            return;
        }
        for(int i=0; i<n; i++){
            if(isSafe(mat,row,i,n)){
            mat[row][i]='Q';
            Helper(mat,row+1,n);
            mat[row][i]='.';
            }
            
        }
    }

     boolean isSafe(char[][]mat,int row,int col,int n){
        for(int i=0; i<row; i++){
            if(mat[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0 && j>=0 ; i--,j--){
            if(mat[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col+1; i>=0 && j<n ; i--,j++){
            if(mat[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public int totalNQueens(int n) {
         count=0;
         char[][]mat=new char[n][n];
            for(int i=0; i<n; i++){
                Arrays.fill(mat[i],'.');
            }
        Helper(mat,0,n);
        return count;
    }
}



