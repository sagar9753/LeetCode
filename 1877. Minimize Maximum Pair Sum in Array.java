Ques Link - https://leetcode.com/problems/minimize-maximum-pair-sum-in-array

------------------------------------------- Solution ----------------------------------------------

class Solution {
    public int minPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0 ; i < n/2 ; i++)
            ans = Math.max(ans,nums[i]+nums[n-i-1]);

        return ans;

    }
}
