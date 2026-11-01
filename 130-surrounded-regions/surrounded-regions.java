class Solution {
    void dfs(int r,int c,char[][]board,boolean[][] visited){
         int n=board.length;
        int m=board[0].length;
        if(r<0||c<0||r>=n||c>=m||visited[r][c]||board[r][c]=='X'){
            return;
        }
        visited[r][c]=true;
        dfs(r-1,c,board,visited);
        dfs(r+1,c,board,visited);
        dfs(r,c-1,board,visited);
        dfs(r,c+1,board,visited);


    }
    public void solve(char[][] board) {
        int n=board.length;
        int m=board[0].length;
        boolean[][] visited=new boolean[n][m];
        for(int i=0; i<n; i++){
              if(board[i][0]=='O' && !visited[i][0]){
                dfs(i,0,board,visited);
            }

            if(board[i][m-1]=='O' && !visited[i][m-1]){
                dfs(i,m-1,board,visited);
            }
            }
         for(int i=0; i<m; i++){
            if(board[0][i]=='O' && !visited[0][i]){
                dfs(0,i,board,visited);
            }
             if(board[n-1][i]=='O' && !visited[n-1][i]){
                dfs(n-1,i,board,visited);
             }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]=='O' && !visited[i][j]){
                    board[i][j]='X';
                    visited[i][j]=true;
                }
            }
        }
        
    }
}