Ques Link - https://leetcode.com/problems/first-missing-positive

----------------------------------- Solution ----------------------------------------

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i;

        for(i = 0 ; i < n ; i++){
            if(nums[i] <= 0)
                nums[i] = n + 1;
        }
        for(i = 0 ; i < n ; i++){
            int j = Math.abs(nums[i]) - 1;
            if(j < n && nums[j] > 0)
                nums[j] *= -1;
        }
        for(i = 0 ; i < n ; i++){
            if(nums[i] > 0)
                return i+1;
        }
        return i+1;
    }
}
