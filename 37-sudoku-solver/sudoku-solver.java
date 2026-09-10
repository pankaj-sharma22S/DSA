class Solution {
    boolean isValid(char[][] board,int r,int c,int n,char num){
        for(int i=0; i<n; i++){
            if(board[i][c]==num){
                return false;
            }
        }
         for(int i=0; i<n; i++){
            if(board[r][i]==num){
                return false;
            }
        }
        int nr=r-r%3;
        int nc=c-c%3;
        for(int i=nr; i<nr+3; i++){
            for(int j=nc; j<nc+3; j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
    boolean solver(char[][] board,int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]=='.'){
                    
                    for(char num='1'; num<='9'; num++){
                        if(isValid(board,i,j,n,num)){
                            board[i][j]=num;
                            if(solver(board,n)){
                                return true;
                            }
                            else{
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
            
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        int n=board.length;
        solver(board,n);

        
    }
}