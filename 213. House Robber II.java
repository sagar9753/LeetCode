Ques Link - https://leetcode.com/problems/house-robber-ii

----------------------------------------------------- Solution (Recursion + Memoization) -----------------------------------------------------------

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        int l = solve(nums,0,nums.length-2,dp);
        Arrays.fill(dp,-1);
        int r = solve(nums,1,nums.length-1,dp);
        return Math.max(l,r);
    }
    public int solve(int[] nums,int l ,int r,int[] dp){
        if(r < l)
            return 0;
        if(r == l)
            return nums[l];

        if(dp[r] != -1)
            return dp[r];
        
        int rob = nums[r] + solve(nums,l,r-2,dp);
        int notrob = solve(nums,l,r-1,dp);

        return dp[r] = Math.max(rob,notrob);
    }
}

------------------------------------------------------ Solution (Tabulation) ------------------------------------------------------------

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int l = solve(nums,0,nums.length-2);
        int r = solve(nums,1,nums.length-1);
        return Math.max(l,r);
    }
    public int solve(int[] nums,int l ,int r){
        int[] dp = new int[nums.length];
        dp[l] = nums[l];

        for(int i = l+1;i <= r; i++){
            int rob = nums[i];
            if(i > l+1)
                rob += dp[i-2];
            int notrob = dp[i-1];

            dp[i] = Math.max(rob,notrob);
        }
        return dp[r];
    }
}

-------------------------------------------------- Solution (Space Optimization) ------------------------------------------------------

class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        int l = solve(nums,0,nums.length-2);
        int r = solve(nums,1,nums.length-1);
        return Math.max(l,r);
    }
    public int solve(int[] nums,int l ,int r){
        int prev1 = 0;
        int prev2 = 0;

        for(; l <= r ; l++){
            int dp = Math.max(nums[l]+prev2,prev1);
            prev2 = prev1;
            prev1 = dp;
        }
        return prev1;
    }
}
