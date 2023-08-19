Ques Link - https://leetcode.com/problems/left-and-right-sum-differences/description/

-------------------------------- Solution -------------------------------------

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] ans = new int[nums.length];

        for(int i = 1 ; i < nums.length ; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        int suffix = 0;
        for(int i = nums.length-1 ; i >= 0 ; i--){
            ans[i] = Math.abs(prefix[i] - suffix);
            suffix += nums[i];
        }
        return ans;
    }
}
