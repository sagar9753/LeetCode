Ques Link - https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/

--------------------------------------- Solution --------------------------------------------

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double ans = Integer.MAX_VALUE;
        for(int l = 0, r = nums.length-1 ; l < r ; l++,r--){
            double avg = (double)(nums[l] + nums[r]) / 2;
            ans = Math.min(ans, avg);
        }
        return ans;
    }
}
