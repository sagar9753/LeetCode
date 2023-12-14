Ques Link - https://leetcode.com/problems/number-of-good-pairs

------------------------------------------- Solution ----------------------------------------------------

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] count = new int[101];
        int ans=0;

        for(int num : nums)
            ans += count[num]++;

        return ans;
    }
}
