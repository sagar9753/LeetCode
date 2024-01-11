Ques Link - https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

---------------------------------------------- Solution ---------------------------------------------------

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l < r){
            int sum = nums[l] + nums[r];
            if(sum == target)
                break;
            else if(sum > target)
                r--;
            else
                l++;
        }
        return new int[]{l+1,r+1};
    }
}
