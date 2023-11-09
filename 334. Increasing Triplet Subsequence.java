Ques Link - https://leetcode.com/problems/increasing-triplet-subsequence

-------------------------------------- Solution -------------------------------------------

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] <= num1)
                num1 = nums[i];
            else if(nums[i] <= num2)
                num2 = nums[i];
            else
                return true;
        }
        return false;
    }
}
