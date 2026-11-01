class Solution {

    void dfs(int r, int c, int[][] grid, boolean[][] visited) {

        int n = grid.length;
        int m = grid[0].length;

        if (r < 0 || c < 0 || r >= n || c >= m ||
            visited[r][c] || grid[r][c] == 0) {
            return;
        }

        visited[r][c] = true;

        dfs(r - 1, c, grid, visited);
        dfs(r + 1, c, grid, visited);
        dfs(r, c - 1, grid, visited);
        dfs(r, c + 1, grid, visited);
    }

    public int numEnclaves(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {

            if (grid[i][0] == 1 && !visited[i][0]) {
                dfs(i, 0, grid, visited);
            }

            if (grid[i][m - 1] == 1 && !visited[i][m - 1]) {
                dfs(i, m - 1, grid, visited);
            }
        }

        for (int j = 0; j < m; j++) {

            if (grid[0][j] == 1 && !visited[0][j]) {
                dfs(0, j, grid, visited);
            }

            if (grid[n - 1][j] == 1 && !visited[n - 1][j]) {
                dfs(n - 1, j, grid, visited);
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1 && !visited[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }
}