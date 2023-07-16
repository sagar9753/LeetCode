Ques Link - https://leetcode.com/problems/min-cost-climbing-stairs/description/

----------------------------------------------- Solution 1 (Recursion) -----------------------------------------------

class Solution {
    public int solve(int[] cost,int n,int[] dp){
        if(n<2)
            return cost[n];
        if(dp[n] != -1)
            return dp[n];
        
        dp[n] = cost[n] + Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
        return dp[n];
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(solve(cost,n-1,dp),solve(cost,n-2,dp));
    }
}

---------------------------------------------- Solution 2 (DP) -----------------------------------------------------

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n1 = cost[0];
        int n2 = cost[1];
        int res;
        for(int i = 2 ; i < cost.length ; i++){
            res = Math.min(n1,n2) + cost[i];
            n1 = n2;
            n2 = res;
        }
        return Math.min(n1,n2);
    }
}
