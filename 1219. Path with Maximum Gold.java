Ques Link - https://leetcode.com/problems/path-with-maximum-gold

----------------------------------------- Solution -------------------------------------------

class Solution {
    public int getMaximumGold(int[][] grid) {
        int ans = -1;
        for(int i = 0 ; i < grid.length ; i++)
            for(int j = 0 ; j < grid[0].length ; j++)
                ans = Math.max(ans, solve(grid, i, j));

        return ans;
    }
    public int solve(int[][] grid, int i, int j){
        if(i < 0 || i == grid.length || j < 0 || j == grid[0].length || grid[i][j] == 0)
            return 0;
            
        int gold = grid[i][j];
        grid[i][j] = 0;

        int down = solve(grid, i+1, j);
        int up = solve(grid, i-1, j);
        int left = solve(grid, i, j-1);
        int right = solve(grid, i, j+1);

        grid[i][j] = gold;

        return gold + Math.max(Math.max(down, up), Math.max(left, right));
    }
}
