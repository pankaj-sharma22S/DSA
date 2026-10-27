class Solution {
    int[] drow = {-1, 0, +1, 0};
    int[] dcol = {0, 1, 0, -1};

    void dfs(int[][] image, int r, int c, int ncolor, int original) {
        if (r < 0 || c < 0 || r >= image.length ||
            c >= image[0].length || image[r][c] != original) {
            return;
        }

        image[r][c] = ncolor;

        dfs(image, r + 1, c, ncolor, original);
        dfs(image, r - 1, c, ncolor, original);
        dfs(image, r, c + 1, ncolor, original);
        dfs(image, r, c - 1, ncolor, original);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans = image;
        int original = ans[sr][sc];

        if (original == color) {
            return ans;
        }

        dfs(image, sr, sc, color, original);

        return ans;
    }
}