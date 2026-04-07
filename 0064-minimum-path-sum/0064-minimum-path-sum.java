// class Solution {
//     int min = Integer.MAX_VALUE;
//     public int minPathSum(int[][] grid) {
//         helper(grid, 0, 0, 0);
//         return min;
//     }

//     void helper(int[][] grid,int i,int j,int sum){
//         if(i >= grid.length || j >= grid[0].length){
//             return;
//         }
//         sum += grid[i][j];
//         if(i == grid.length-1 && j == grid[0].length-1){
//             min = Math.min(min,sum);
//             return;
//         }
//         helper(grid,i+1,j,sum);
//         helper(grid,i,j+1,sum);
//     }
// }

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i =1;i<m;i++){
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for(int j=1;j<n;j++){
            dp[0][j] = dp[0][j-1] + grid[0][j];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m-1][n-1];
    }
}

