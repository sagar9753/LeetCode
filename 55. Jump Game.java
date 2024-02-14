Ques Link - https://leetcode.com/problems/jump-game/

----------------------------------------- Solution (Recursion + Memoization) -----------------------------------------

class Solution {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return solve(nums,0,dp);
    }
    public boolean solve(int[] nums, int ind,int[] dp){
        if(ind == nums.length - 1) return true;
        if(nums[ind] == 0) return false;

        if(dp[ind] != -1){
            return dp[ind] == 1 ? true : false;
        }

        for(int i = 1 ; i <= nums[ind] ; i++){
            if(solve(nums,ind + i,dp)){
                dp[ind] = 1;
                return true;
            }
        }
        dp[ind] = 0;
        return false;
    }
}
