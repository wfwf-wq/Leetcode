class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;  
        int[] dp = new int[n];  
        dp[0] = 1;
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++){
                if(obstacleGrid[j][i] == 1) dp[j] = 0;
                else if(j > 0 )dp[j] = dp[j] + dp[j-1];
            }
        return dp[n-1];
    }
}