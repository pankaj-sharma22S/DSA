class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row=new int[9][9];
        int[][] col=new int[9][9];
        int[][] boxes=new int[9][9];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]=='.'){
                    continue;
                }
                int val=board[i][j]-'1';
                if(row[i][val]==1){
                    return false;
                }
                row[i][val]=1;
                if(col[val][j]==1){
                    return false;
                }
                col[val][j]=1;
                int boxidx=3*(i/3)+(j/3);
                if(boxes[boxidx][val]==1){
                    return false;
                }
                boxes[boxidx][val]=1;
            }
        }
        return true;
    }
}