class Solution {
    public int closedIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (r == 0 || r == rows - 1 || c == 0 || c == cols - 1) {
                    if (grid[r][c] == 0) {
                        helper(grid, r, c);
                    }
                }
            }
        }
        int closedIslands = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 0) {
                    closedIslands++;
                    helper(grid, r, c);
                }
            }
        }
        return closedIslands;
    }

    void helper(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != 0) {
            return;
        }
        grid[r][c] = 1;
        helper(grid, r + 1, c);
        helper(grid, r - 1, c);
        helper(grid, r, c + 1);
        helper(grid, r, c - 1);
    }
}