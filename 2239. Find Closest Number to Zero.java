Ques Link - https://leetcode.com/problems/find-closest-number-to-zero/description/

----------------------------------- Solution -------------------------------------

class Solution {
    public int findClosestNumber(int[] nums) {
        int close = 0;
        int min = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            if(Math.abs(nums[i] - 0) < min){
                min = Math.abs(nums[i] - 0);
                close = nums[i];
                continue;
            }
            if(Math.abs(nums[i] - 0) == min)
                close = Math.max(close,nums[i]);
            
        }
        return close;
    }
}
