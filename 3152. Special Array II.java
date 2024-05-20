Ques Link - https://leetcode.com/problems/special-array-ii/

------------------------------------------ Solution -------------------------------------------

class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int[] specPos = new int[nums.length];
        boolean[] ans = new boolean[queries.length];
        int count = 0;

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] % 2 == nums[i-1] % 2)
                count++;
            specPos[i] = count;
        }

        for(int i = 0 ; i < queries.length ; i++){
            ans[i] = specPos[queries[i][0]] == specPos[queries[i][1]];
        }
        return ans;
    }
}
