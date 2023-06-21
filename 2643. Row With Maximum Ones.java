------------------------------------------ 2d Array (Easy) --------------------------------------------------
  
Ques Link - https://leetcode.com/problems/row-with-maximum-ones/description/

------------------------------------------ Solution ---------------------------------------------------------
  
class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int [] ans = new int[2];
        ans[1]= Integer.MIN_VALUE;
        int sum;

        for(int i=0;i<mat.length;i++){
            sum=0;
            for(int j=0;j<mat[0].length;j++)
                sum += mat[i][j];
            if(sum > ans[1]){
                ans[0] = i;
                ans[1] = sum;
            }
        }
        return ans;
    }
}
