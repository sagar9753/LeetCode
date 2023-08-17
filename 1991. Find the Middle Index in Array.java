Ques Link - https://leetcode.com/problems/find-the-middle-index-in-array/description/

----------------------------------- Solution ----------------------------------------

class Solution {
    public int findMiddleIndex(int[] nums) {
        int r = Arrays.stream(nums).sum();
        int l = 0;

        for(int i = 0 ; i < nums.length ; i++){
            r -= nums[i];
            if(r == l)
                return i;
            l += nums[i];
        }
        return -1;
    }
}
