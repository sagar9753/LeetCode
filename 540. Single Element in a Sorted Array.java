Ques Link - https://leetcode.com/problems/single-element-in-a-sorted-array/

-------------------------------------- Solution ------------------------------------------------

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int mid;

        while(l < r){
            mid = (l + r)/2;

            if(mid % 2 != 0)
                mid--;
            if(nums[mid] == nums[mid+1])
                l = mid + 2;
            else
                r = mid;
        }
        return nums[l];
    }
}
