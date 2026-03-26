class Solution {
    public int matrixScore(int[][] grid) {
        for(int i = 0;i<grid.length;i++){
            if(grid[i][0] == 0){
                for(int j=0;j<grid[0].length;j++){
                    grid[i][j] = Math.abs(grid[i][j]-1);
                }
            }
        }
        int res = 0;
        for(int i=0;i<grid[0].length;i++){
            int ones = 0;
            for(int j=0;j<grid.length;j++){
                if(grid[j][i]==1){
                    ones++;
                }
            }
            int max = Math.max(ones,grid.length-ones);
            res += max*(1<<(grid[0].length-i-1));
        }
        return res;
    }
}