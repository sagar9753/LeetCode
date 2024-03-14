Ques Link - https://leetcode.com/problems/binary-subarrays-with-sum

------------------------------------- Solution ------------------------------------------

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0, count = 0, ans = 0;

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                sum += 1;
                count = 0;
            }
            while (sum > goal)
                sum -= nums[j++];

            while (sum == goal && j <= i) {
                count++;
                sum -= nums[j];
                j++;
            }
            ans += count;
        }
        return ans;
    }
}
