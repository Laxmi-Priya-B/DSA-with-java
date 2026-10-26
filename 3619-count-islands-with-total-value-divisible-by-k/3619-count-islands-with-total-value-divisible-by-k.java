class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n=grid[0].length;
        int res = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] > 0){
                    long s = helper(grid,i,j,m,n);
                    if(s%k==0){
                        res++;
                    }
                }
            }
        }
        return res;
    }
    long helper(int[][] grid,int i,int j,int m,int n){
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] == 0){
            return 0;
        }
        long sum = grid[i][j];
        grid[i][j] = 0;
        sum += helper(grid, i + 1, j,m,n);
        sum += helper(grid, i - 1, j,m,n);
        sum += helper(grid, i, j + 1,m,n);
        sum += helper(grid, i, j - 1,m,n);
        return sum;
    }
}