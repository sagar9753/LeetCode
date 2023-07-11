Ques Link - https://leetcode.com/problems/partition-array-according-to-given-pivot/description/

---------------------------------------- Solution ---------------------------------------

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int i = 0;
        for(int num : nums)
            if(num < pivot)
                ans[i++] = num;

        for(int num : nums)
            if(num == pivot)
                ans[i++] = num;

        for(int num : nums)
            if(num > pivot)
                ans[i++] = num;

        return ans;
    }
}
