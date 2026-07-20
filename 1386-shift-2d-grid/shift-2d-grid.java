class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
      
     while(k>0){
     int  m=grid[grid.length-1][grid[0].length-1];
     for(int i=grid.length-1; i>=0; i--){
        for(int j=grid[0].length-1; j>=0; j--){
          if(j>0){
           grid[i][j]=grid[i][j-1];
          }
          else{
            if(i>0){
            grid[i][j]=grid[i-1][grid[0].length-1];
            }
          }
        }
     }   
     grid[0][0]=m;
     k--;
     }
     List<List<Integer>> ans = new ArrayList<>();
     for (int[] row : grid) {
    List<Integer> temp = new ArrayList<>();
    for (int num : row) temp.add(num);
    ans.add(temp);
}
     return ans;
    }
}