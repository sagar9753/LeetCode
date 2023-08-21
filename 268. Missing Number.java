Ques Link - https://leetcode.com/problems/missing-number/

---------------------------------- Solution ------------------------------------

class Solution {
    public int missingNumber(int[] nums) {
        int totalsum = 0 ;
        int arrsum = 0;

        for(int i = 0 ; i < nums.length; i++){
            totalsum += i+1;
            arrsum += nums[i];
        }
        return totalsum-arrsum;
    }
}
