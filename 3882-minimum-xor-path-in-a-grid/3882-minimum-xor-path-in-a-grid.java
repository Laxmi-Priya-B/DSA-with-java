class Solution {
    public int minCost(int[][] grid) {
        int n = grid[0].length;
        boolean[][] dp = new boolean[n][1024];

        boolean firstRow = true;
        for (int[] row : grid) {
            boolean[][] temp = new boolean[n][1024];
            for (int i = 0; i < n; i++) {
                int val = row[i];
                if (firstRow && i == 0) {
                    temp[0][val] = true;
                    continue;
                }
                for (int j = 0; j < 1024; j++) {
                    if (!firstRow && dp[i][j]) {
                        temp[i][j ^ val] = true;
                    }
                    if (i > 0 && temp[i - 1][j]) {
                        temp[i][j ^ val] = true;
                    }
                }
            }
            dp = temp;
            firstRow = false;
        }

        for (int i = 0; i < 1024; i++) {
            if (dp[n - 1][i]) {
                return i;
            }
        }

        return 0;
    }
}