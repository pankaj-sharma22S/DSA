class Solution {
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
    void Helper(char[][]mat,int row,int n,List<List<String>> res){
        List<String> ans=new ArrayList<>();
        if(row==n){
            for(int j=0; j<n; j++){
            ans.add(new String(mat[j]));
            }
            res.add(ans);
            
            return;
        }
        for(int i=0; i<n; i++){
            if(isSafe(mat,row,i,n)){
            mat[row][i]='Q';
            Helper(mat,row+1,n,res);
            mat[row][i]='.';
            }
            
        }
    }

    public List<List<String>> solveNQueens(int n) {
            List<List<String>> res=new ArrayList<>();
            char[][]mat=new char[n][n];
            for(int i=0; i<n; i++){
                Arrays.fill(mat[i],'.');
            }
        Helper(mat,0,n,res);
        return res;
    }
}