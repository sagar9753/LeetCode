Ques Link - https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative

-------------------------------------------- Solution ----------------------------------------------

class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;

        while(l < r){
            if(nums[l] > 0)
                break;
            int ln = Math.abs(nums[l]), rn = nums[r];
            if(ln == rn)
                return ln;
            else if(ln > rn)
                l++;
            else
                r--;
        }
        return -1;
    }
}
