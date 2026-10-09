class Solution {
    int ans=0;
    int total=0;
     public void helper(int[][]grid,int r,int c,int count){
            if (r < 0 || c < 0 || r >= grid.length ||
    c >= grid[0].length || grid[r][c] == -1){
                return ;
            }
            if(grid[r][c]==2){
                if(count+1==total){
                    ans++;
                }
                return;
            }
            int temp = grid[r][c];
                grid[r][c] = -1;

            helper(grid,r-1,c,count+1);
            helper(grid,r+1,c,count+1);   
            helper(grid,r,c-1,count+1);
            helper(grid,r,c+1,count+1);
            grid[r][c] = temp;
        }

    public int uniquePathsIII(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int row=0;
        int col=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]!=-1){

                    total++;
                }
                if(grid[i][j]==1){
                    row=i;
                    col=j;
                }
            }
        }
            helper(grid,row,col,0);
        return ans;
    }
}