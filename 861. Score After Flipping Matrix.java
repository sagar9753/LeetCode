Ques Link - https://leetcode.com/problems/score-after-flipping-matrix

-------------------------------------- Solution -----------------------------------------

class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int ans = 0;

        for (int i = 0; i < m; i++)
            if (grid[i][0] == 0)
                flipRow(grid, i);

        for (int j = 0; j < n; j++)
            if (oneCount(grid, j) * 2 < m)
                flipCol(grid, j);

        for (int[] row : grid)
            ans += toBinary(row);

        return ans;
    }

    public void flipRow(int[][] grid, int i) {
        for (int j = 0; j < grid[0].length; j++)
            grid[i][j] = grid[i][j] == 1 ? 0 : 1;
    }

    public void flipCol(int[][] grid, int j) {
        for (int i = 0; i < grid.length; i++)
            grid[i][j] = grid[i][j] == 1 ? 0 : 1;
    }

    public int oneCount(int[][] grid, int j) {
        int count = 0;
        for (int i = 0; i < grid.length; i++)
            count += grid[i][j] == 1 ? 1 : 0;
        return count;
    }

    private int toBinary(int[] row) {
        int res = row[0];
        for (int j = 1; j < row.length; ++j)
            res = res * 2 + row[j];
        return res;
    }
}
