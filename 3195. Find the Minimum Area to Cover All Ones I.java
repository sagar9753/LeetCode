Ques link - https://leetcode.com/problems/find-the-minimum-area-to-cover-all-ones-i/

------------------------------------------ Solution -----------------------------------

class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int top = m,bottom = 0, left = n, right = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(grid[i][j] == 1){
                    top = Math.min(top,i);
                    bottom = Math.max(bottom, i);
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                }
            }
        }
        return (right - left + 1) * (bottom - top + 1);
    }
}
