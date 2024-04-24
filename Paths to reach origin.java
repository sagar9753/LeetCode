Ques Link - https://www.geeksforgeeks.org/problems/paths-to-reach-origin3850/1

---------------------------------------- Solution -------------------------------------------

class Solution
{
    public static int ways(int n, int m)
    {
        int dp[][] = new int[n + 1][m + 1];
        int mod = (int) 1e9 + 7;
        
        for(int i = 0; i <= n; i++)
            dp[i][0] = 1;
            
        for(int i = 0; i <= m; i++)
            dp[0][i] = 1;
            
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= m; j++) {
                int a = (dp[i - 1][j] + dp[i][j - 1]) % mod;
                dp[i][j] = a % mod;
            }
        }
        
        return dp[n][m];
    }
}
