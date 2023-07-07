Ques Link - https://leetcode.com/problems/climbing-stairs/description/?envType=study-plan-v2&envId=dynamic-programming

----------------------------------------------- Solution (Recursion + Memoization) --------------------------------

class Solution {
    public int solve(int n , int[] dp){
        if(n<2)
            return 1;
        if(dp[n] != -1)
            return dp[n];
        dp[n] = solve(n-1,dp)+solve(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        if(n==1)
            return n;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n-1,dp) + solve(n-2,dp);
    }
}

--------------------------------------------- Solution (DP) -----------------------------------------------

class Solution {
    public int climbStairs(int n) {
        int n1 = 1;
        int n2 = 1;
        int dp;
        for(int i = 2; i<=n ; i++){
            dp = n1 + n2;
            n2 = n1;
            n1 = dp;
        }
        return n1;
    }
}
