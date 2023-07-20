Ques Link - https://leetcode.com/problems/sum-in-a-matrix/description/

------------------------------------------------- Solution --------------------------------------------------------

class Solution {
    public int matrixSum(int[][] nums) {
        int max = 0;
        int ans = 0;

        for(int[] n : nums){
            Arrays.sort(n);
        }

        for(int j = nums[0].length-1 ; j >= 0 ; j--){
            max=0;
            for(int i = 0 ; i< nums.length ; i++)
                max = Math.max(max,nums[i][j]);
            ans += max;
        }
        return ans;
    }
}
