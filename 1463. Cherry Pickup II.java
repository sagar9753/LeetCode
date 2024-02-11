Ques Link - https://leetcode.com/problems/cherry-pickup-ii

-------------------------------------------- Solution ------------------------------------------------------

class Solution {
    public int cherryPickup(int[][] grid) {
        int dp[][][] = new int[grid.length][grid[0].length][grid[0].length];
        for (int row1[][] : dp) {
            for (int row2[] : row1) {
                Arrays.fill(row2, -1);
            }
        }
        return solve(0, 0, grid[0].length - 1, grid,dp);
    }

    public int solve(int i, int j1, int j2, int[][] grid,int[][][] dp) {
        int n = grid.length, m = grid[0].length;

        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m)
            return Integer.MIN_VALUE;

        int addNum = grid[i][j1];
        if (j1 != j2)
            addNum += grid[i][j2];

        if (i == n - 1)
            return addNum;

        if(dp[i][j1][j2] != -1) return dp[i][j1][j2];

        int ans = Integer.MIN_VALUE;
        for (int p = -1; p <= 1; p++) {
            for (int q = -1; q <= 1; q++) {
                ans = Math.max(ans, addNum + solve(i + 1, j1 + p, j2 + q, grid,dp));
            }
        }

        return dp[i][j1][j2] = ans;
    }
}
