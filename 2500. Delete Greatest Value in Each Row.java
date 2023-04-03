-----------------------------------------2d Array (Easy)-----------------------------------------
  
Question link :- https://leetcode.com/problems/delete-greatest-value-in-each-row/description/

-----------------------------------------Solution---------------------------------------------------

class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans=0;

        for (int[] row : grid)
            Arrays.sort(row);

        for(int col=grid[0].length-1; col >= 0;col--){
            int max=0;
            for(int row =0;row<grid.length;row++){
                if(grid[row][col] > max)
                    max=grid[row][col];
            }
            ans+=max;
        }
        return ans;
    }
}
