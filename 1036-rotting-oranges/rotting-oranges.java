
import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();

        int[] row = {-1, 0, 1, 0};
        int[] col = {0, 1, 0, -1};

        int fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j, 0});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        int ans = 0;

        while (!q.isEmpty()) {
            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];
            int t = curr[2];

            ans = Math.max(ans, t);

            for (int i = 0; i < 4; i++) {
                int nr = r + row[i];
                int nc = c + col[i];

                if (nr < 0 || nc < 0 ||
                    nr >= grid.length || nc >= grid[0].length ||
                    grid[nr][nc] != 1) {
                    continue;
                }

                fresh--;
                grid[nr][nc] = 2;

                q.offer(new int[]{nr, nc, t + 1});
            }
        }

        return fresh == 0 ? ans : -1;
    }
}
