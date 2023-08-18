Ques Link - https://leetcode.com/problems/n-th-tribonacci-number/description/

------------------------------- Solution ---------------------------------

class Solution {
    public int tribonacci(int n) {
        int[] nums = {0,1,1};
        int num = 0;
        if(n < 3)
            return nums[n];

        for(int i = 3 ; i <= n; i++ ){
            num = nums[0] + nums[1] + nums[2];
            nums[0] = nums[1];
            nums[1] = nums[2];
            nums[2] = num;
        }
        return num;
    }
}
