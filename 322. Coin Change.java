Ques Link - https://leetcode.com/problems/coin-change/

------------------------------------- Solution ------------------------------------

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        int ans = solve(coins,amount,coins.length-1,dp);
        if(ans >= (int) Math.pow(10, 9))
            return -1;
        return ans;
    }
    public int solve(int[] arr,int amt,int n,int[][] dp){
        if(n == 0 && amt % arr[0] == 0)
            return amt / arr[0];
        if(n == 0 && amt % arr[0] != 0)
            return (int) Math.pow(10, 9);
        if(dp[n][amt] != -1)
            return dp[n][amt];

        int nottake = solve(arr,amt,n-1,dp);
        int take = (int) Math.pow(10, 9);
        if(arr[n] <= amt)
            take = 1+solve(arr,amt-arr[n],n,dp);

        return dp[n][amt] = Math.min(take,nottake);
    }
}
