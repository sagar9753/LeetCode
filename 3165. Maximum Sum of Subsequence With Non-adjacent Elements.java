Ques Link - https://leetcode.com/problems/maximum-sum-of-subsequence-with-non-adjacent-elements/

-------------------------------------------- Solution -------------------------------------------------

class Solution {
    public int maximumSumSubsequence(int[] nums, int[][] queries) {
        long ans = 0;
        
        for (int[] q : queries) {
            int index = q[0];
            int value = q[1];

            nums[index] = value;
            ans = (ans + solve(nums)) % 1_000_000_007;
        }
        return (int)ans;
    } 
    public int solve(int[] nums){
        int prev1 = 0, prev2 = 0;

        for(int num : nums){
            int dp = Math.max(prev2 + num, prev1);
            prev2 = prev1;
            prev1 = dp;
        }
        return prev1;
    }   
}
