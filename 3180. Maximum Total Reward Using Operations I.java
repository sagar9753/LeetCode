Ques Link - https://leetcode.com/problems/maximum-total-reward-using-operations-i/

---------------------------------- Solution -------------------------------------

class Solution {
    public int maxTotalReward(int[] rewardValues) {
        Arrays.sort(rewardValues);
        int n = rewardValues.length;
        int[][] dp = new int[n][4001]; 
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        
        return solve(rewardValues, 0, 0, dp);
    }
    
    private int solve(int[] rv, int i, int x, int[][] dp) {
        if (i >= rv.length) {
            return x;
        }
        
        if (dp[i][x] != -1) {
            return dp[i][x];
        }
        
        int nottake = solve(rv, i + 1, x, dp); 
        int take = x;
        if (rv[i] > x) {
            take = solve(rv, i + 1, x + rv[i], dp);
        }
        
        return dp[i][x] = Math.max(take, nottake);
    }

}
