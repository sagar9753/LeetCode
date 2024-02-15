Ques Link - https://leetcode.com/problems/find-polygon-with-the-largest-perimeter

----------------------------------------------- Solution ---------------------------------------------------

class Solution {
    public long largestPerimeter(int[] nums) {
        long preSum = 0;
        for(long n : nums)
            preSum += n;

        Arrays.sort(nums);
        for(int i = nums.length-1 ; i >= 2 ; i--){
            if((preSum - nums[i]) > nums[i])
                return preSum;
            preSum -= nums[i];
        }
        return -1;
    }
}
