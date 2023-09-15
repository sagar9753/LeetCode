Ques Link - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

------------------------------------- Solution -----------------------------------------

class Solution {
    public int findMin(int[] nums) {
        int l = 0 ;
        int r = nums.length-1;
        int mid ;

        while(l < r){
            mid = (l+r)/2;

            if(nums[mid] > nums[r])
                l = mid + 1;
            else
                r = mid;
        }
        return nums[l];
    }
}
