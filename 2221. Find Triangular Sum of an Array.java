Ques Link - https://leetcode.com/problems/find-triangular-sum-of-an-array/description/

-------------------------------------------- Solution ----------------------------------------------

class Solution {
    public int triangularSum(int[] nums) {
        int len = nums.length;
        while(len-- > 1){
            for(int j = 0 ; j < len; j++){
                nums[j] = (nums[j]+nums[j+1]) % 10;
            }
        }
        return nums[0];
    }
}
