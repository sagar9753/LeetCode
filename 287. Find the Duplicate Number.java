Ques Link - https://leetcode.com/problems/find-the-duplicate-number

------------------------------------ Solution ---------------------------------------

class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        
        for(int i = 0 ; i < n ; i++){
            int j = Math.abs(nums[i]);
            if(nums[j] < 0)
                return j;
            nums[j] *= -1;
        }
        return 0;
    }
}
