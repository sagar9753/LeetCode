Ques Link - https://leetcode.com/problems/perfect-squares

------------------------------------------- Solution 1 (Recursion + Memoization) -----------------------------------------------

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        return solve(n,dp);
    }
    public int solve(int n,int[] dp){
        if(n < 4)
            return n;
        if(dp[n] != 0) return dp[n];

        int ans = Integer.MAX_VALUE;
        for(int i = 1; i*i <= n ; i++){
            ans = Math.min(ans,1 + solve(n - i*i,dp));
        }
        return dp[n] = ans;
    }
}

-------------------------------------------- Solution 2 (Tabulation) ----------------------------------------------------

class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,n);
        dp[0] = 0;

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j*j <= i ; j++ )
                dp[i] = Math.min(dp[i],1 + dp[i-j*j]);
        }
        return dp[n];
    }
}
