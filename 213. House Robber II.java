Ques Link - https://leetcode.com/problems/house-robber-ii

----------------------------------------------------- Solution -----------------------------------------------------------

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
