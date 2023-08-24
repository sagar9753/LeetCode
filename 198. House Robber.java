--------------------------------------- DP(Medium) ---------------------------------------------------------------

Ques Link - https://leetcode.com/problems/house-robber/description/

--------------------------------------- Solution (Recursion + Memoization) ----------------------------------------------

class Solution {
    public int rob(int[] nums) {
			int[] dp = new int[nums.length]; 
			Arrays.fill(dp,-1);
      int ans = solve(nums.length-1,nums,dp);
			return ans;	
    }
    public int solve(int n , int[] arr,int[] dp){
				if(n < 0)
					return 0;
				if(dp[n] != -1)
            return dp[n];
				if(n==0)
					return arr[n];
				
				int rob = arr[n] + solve(n-2,arr,dp);
				int notrob = 0 + solve(n-1,arr,dp);

				return dp[n] = Math.max(rob,notrob);
	}
}
--------------------------------------- Solution (Tabulation) ----------------------------------------------------------

class Solution {
    public int rob(int[] nums) {
			if (nums.length == 0)
      	return 0;
    	if (nums.length == 1)
      	return nums[0];

			int[] dp = new int[nums.length]; 

      dp[0] = nums[0];
			dp[1] = Math.max(nums[0],nums[1]);

			for(int i = 2 ; i < nums.length ; i++){
				int rob = nums[i] + dp[i-2];
				int notrob = dp[i-1];

				dp[i] = Math.max(rob,notrob);
			}
			return dp[nums.length-1];
    }

}
-------------------------------------- Solution (Space optimized) -----------------------------------------------------

class Solution {
    public int rob(int[] nums) {
        int prev1 = 0;
		    int prev2 = 0;

    		for(int i = 0 ; i < nums.length ; i++){
            int dp = Math.max(nums[i] + prev1,prev2);
    			  prev1 = prev2;
            prev2 = dp;
    		}
		    return prev2;	
    }

}
