Ques Link - https://leetcode.com/problems/unique-paths-ii/

---------------------------------- Solution -----------------------------------

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return solve(obstacleGrid, m - 1, n - 1, dp);
    }

    public int solve(int[][] arr, int m, int n, int[][] dp) {
        if (m >= 0 && n >= 0 && arr[m][n] == 1)
            return 0;
        if (m == 0 && n == 0)
            return 1;
        if (m < 0 || n < 0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        int up = solve(arr, m - 1, n, dp);
        int left = solve(arr, m, n - 1, dp);

        return dp[m][n] = up + left;
    }
}
