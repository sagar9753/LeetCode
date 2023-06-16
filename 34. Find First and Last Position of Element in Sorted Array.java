----------------------------------------------- Array(Medium) ------------------------------------

Que Link - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

---------------------------------------------- Solution ------------------------------------------

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0; 
        int r = nums.length-1;
        int flag = -1;
        int mid;

        while(l<=r){
            mid=(l+r)/2;
            if(nums[mid] == target){
                flag=mid;
                break;
            }
            else if(nums[mid] > target)
                r--;
            else
                l++;
        }

        if(flag == -1)
            return new int[] {-1, -1};
        l=r=flag;

        while(nums[l] == target){
             l--;
             if(l == -1)
                break;
        }
        while(nums[r] == target){
            r++;
            if(r == nums.length)
                break;
        }
        
        return new int[] {l+1, r-1};
    }
}
