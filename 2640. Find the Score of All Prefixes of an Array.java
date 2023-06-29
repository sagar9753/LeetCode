--------------------------------------------- Array (Medium) --------------------------------------------------

Ques Link - https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/

-------------------------------------------- Solution -------------------------------------------------------

class Solution {
    public long[] findPrefixScore(int[] nums) {
        long[] res = new long[nums.length];
        res[0] = nums[0] + nums[0];
        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            max = Math.max(nums[i],max);
            res[i] = res[i-1] + (nums[i]+max);
        }
        return res;
    }
}
