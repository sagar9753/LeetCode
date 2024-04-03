Ques Link - https://leetcode.com/problems/minimum-path-sum/

------------------------------- Solution -------------------------------------

class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return solve(grid,dp,0,0);
    }
    public int solve(int[][] grid,int[][] dp,int i,int j){
        if(i == grid.length-1 && j == grid[0].length-1)
            return grid[i][j];

        if(dp[i][j] != -1)return dp[i][j];
        
        int right = Integer.MAX_VALUE;
        if(j+1 < grid[0].length)
            right = grid[i][j] + solve(grid,dp,i,j+1);

        int down = Integer.MAX_VALUE;
        if(i+1 < grid.length)
            down = grid[i][j] + solve(grid,dp,i+1,j);
        
        return dp[i][j] = Math.min(right,down);
    }
}
