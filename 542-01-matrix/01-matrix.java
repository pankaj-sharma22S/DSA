class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        boolean[][] visited = new boolean[m][n];
        int[][] dist = new int[m][n];

        Queue<int[]> q = new LinkedList<>();
          for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j,0});
                    visited[i][j] = true;
                    dist[i][j] = 0;
                }
            }
        }
        int[] r = {-1, 0, 0, 1};
        int[] c = {0, -1, 1, 0};

        while(!q.isEmpty()){
            int i=q.peek()[0];
            int j=q.peek()[1];
            int d=q.peek()[2];
            int[]arr =q.poll();
            for(int k=0; k<4; k++){
            int row=i+r[k];
            int col=j+c[k];
            if(row<0||col<0||row>=mat.length||col>=mat[0].length||visited[row][col]==true){
                continue;
            }
            
                dist[row][col]=d+1;
                visited[row][col]=true;
                q.offer(new int[]{row,col,d+1});
            
        }
        }
        return dist;
    }
}