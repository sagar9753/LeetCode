Ques Link - https://leetcode.com/problems/set-mismatch

--------------------------------------------- Solution --------------------------------------------

class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup = 0;

        for(int num : nums){
            if(nums[Math.abs(num) - 1] < 0)
                dup = Math.abs(num);
            else
                nums[Math.abs(num) - 1] *= -1;
        }
        int i;
        for(i = 0 ; i < nums.length ; i++)
            if(nums[i] > 0)
                break;
        return new int[]{dup,i+1};
    }
}
