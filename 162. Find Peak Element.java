Ques Link - https://leetcode.com/problems/find-peak-element/

-------------------------------------------- Solution -------------------------------------------------------

class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0 ;
        int r = nums.length-1;

        while(l <= r){
            int mid = (l+r)/2;
            int prev = mid-1 < 0 ? Integer.MIN_VALUE : nums[mid-1];
            int next = mid+1 >= nums.length ?Integer.MIN_VALUE : nums[mid+1];

            if(nums[mid] > prev && nums[mid] > next){
                return mid;
            }

            if(nums[mid] < prev)
                r = mid-1;
            else
                l = mid+1;
        }

        return 0;
    }
}
