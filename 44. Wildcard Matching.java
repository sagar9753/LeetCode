Ques Link - https://leetcode.com/problems/wildcard-matching/

---------------------------------------- Solution ----------------------------------------

class Solution {
    public boolean isMatch(String s, String p) {
        int[][] dp = new int[s.length()][p.length()];
        for (int[] row : dp)
            Arrays.fill(row, -1);

        return solve(s, p, 0, 0, dp);
    }

    public boolean solve(String s, String p, int i, int j, int[][] dp) {
        if (i >= s.length() && j >= p.length())
            return true;
        if (i < s.length() && j >= p.length())
            return false;
        if (i >= s.length() && j < p.length())
            return checkAllStar(p, j);

        if (dp[i][j] != -1)
            return dp[i][j] == 0 ? false : true;

        boolean check = false;
        if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')
            check = solve(s, p, i + 1, j + 1, dp);
        else if (p.charAt(j) == '*')
            check = solve(s, p, i + 1, j, dp) || solve(s, p, i, j + 1, dp);

        dp[i][j] = check ? 1 : 0;
        return check;
    }

    public boolean checkAllStar(String p, int i) {
        for (; i < p.length() ; i++) {
            if (p.charAt(i) != '*')
                return false;
        }
        return true;
    }
}
