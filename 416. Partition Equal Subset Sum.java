Ques Link - https://leetcode.com/problems/partition-equal-subset-sum/description/

------------------------------------------ Solution -------------------------------------------

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0 ;
        for(int i = 0 ; i < nums.length ; i++)
            sum += nums[i];
        if(sum % 2 != 0)
            return false;
        return solve(nums,sum/2,nums.length);
    }
    public boolean solve(int[] nums,int tar,int n){
        boolean[][] dp = new boolean[n][tar+1];
        for(int i = 0 ; i < n ; i++)
            dp[i][0] = true;
        
        if(nums[0] <= tar)
            dp[0][nums[0]] = true;

        for(int i = 1 ; i < n ; i++){
            for(int k = 1 ; k <= tar ; k++){
                boolean nottake = dp[i-1][k];
                boolean take = false;
                if(nums[i] <= k)
                    take = dp[i-1][k-nums[i]];

                dp[i][k] = take || nottake;
            }
        }
        return dp[n-1][tar];
    }
}
