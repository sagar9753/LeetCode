Ques Link - https://leetcode.com/problems/coin-change-ii/

------------------------------------- SOlution -------------------------------------\\

class Solution {
    private int count = 0;
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return solve(amount,coins,coins.length-1,dp);
    }
    public int solve(int tar,int[] arr,int n,int[][] dp){
        if(n == 0){
            if(tar%arr[0] == 0)
                return 1;
            return 0;
        }
        if(dp[n][tar] != -1)
            return dp[n][tar];

        int nottake = solve(tar,arr,n-1,dp);
        int take = 0;
        if(tar-arr[n] >= 0)
            take = solve(tar-arr[n],arr,n,dp);
        
        return dp[n][tar] = take + nottake;
    }
}
