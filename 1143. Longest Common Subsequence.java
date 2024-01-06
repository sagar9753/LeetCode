Ques - https://leetcode.com/problems/longest-common-subsequence/

-------------------------------------------------------- Solution(Recursion + Memoization) -----------------------------------------------------------

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length()][text2.length()];
        for (int rows[] : dp)
            Arrays.fill(rows, -1);
        return solve(0,0,text1,text2,dp);
    }

    public int solve(int i, int j, String t1, String t2, int dp[][]){
        if(i >= t1.length() || j >= t2.length())
            return 0;
        
        if(dp[i][j] != -1)
            return dp[i][j];

        if(t1.charAt(i) == t2.charAt(j))
            return dp[i][j] = 1 + solve(i+1,j+1,t1,t2,dp);

        int a = solve(i+1,j,t1,t2,dp);
        int b = solve(i,j+1,t1,t2,dp);

        return dp[i][j] = Math.max(a,b);
    }
}

--------------------------------------------- Solution (Tabulation)----------------------------------------------------

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length() + 1][text2.length() + 1];

        for(int i = 0 ; i < text1.length();i++){
            for(int j = 0 ; j < text2.length() ; j++){
                if(text1.charAt(i) == text2.charAt(j))
                    dp[i+1][j+1] = 1 + dp[i][j];
                else
                    dp[i+1][j+1] = Math.max(dp[i][j+1],dp[i+1][j]);
            }
        }
        
        return dp[text1.length()][text2.length()];
    }
}
