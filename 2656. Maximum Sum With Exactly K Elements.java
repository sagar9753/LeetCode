------------------------------------------------ Array(Easy) -------------------------------------------
  
Que Link - 2656. Maximum Sum With Exactly K Elements

------------------------------------------------ Solution --------------------------------------------

class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int maxsum=0;
        for (int i=0;i<k;i++){
            maxsum+=nums[nums.length-1];
            nums[nums.length-1]++;
        }

        return maxsum;
    }
}
