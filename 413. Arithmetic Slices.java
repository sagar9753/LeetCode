Ques Link - https://leetcode.com/problems/arithmetic-slices/

-------------------------------------------- Solution ---------------------------------------------------------

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int diff = 0, j = 0,i;
        int ans = 0;

        for(i = 1; i < nums.length ; i++){
            if(nums[i] - nums[i-1] != diff){
                diff = nums[i] - nums[i-1];
                j = i - 1;
            }
            if(i-j+1 >= 3)
                ans += (i-j+1-2);
        }
        return ans;
    }
}
