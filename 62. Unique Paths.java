Ques Link - https://leetcode.com/problems/unique-paths

------------------------------------------ Solution (Memoization) -----------------------------------------------

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int row[] : dp)
            Arrays.fill(row,-1);
        return solve(m-1,n-1,dp); 
    }
    public int solve(int m, int n, int[][] dp){
        if(m == 0 && n == 0)
            return 1;
        if(m < 0 || n < 0)
            return 0;

        if(dp[m][n] != -1) return dp[m][n];

        int up = solve(m-1,n,dp);
        int left = solve(m,n-1,dp);

        return dp[m][n] = up + left;
    }
}

------------------------------------------ Solution (Tabulation) -----------------------------------------------

class Solution {
    public int uniquePaths(int m, int n) {
        int[] prev = new int[n];
        Arrays.fill(prev,1);
        
        for(int i = 1 ; i < m ; i++){
            int cur[] = new int[n];
            for(int j = 0 ; j < n ; j++){
                int up = prev[j];

                int left = 0;
                if(j > 0)
                    left = cur[j-1];

                cur[j] = up + left;
            }
            prev = cur;
        }
        return prev[n-1];
    }
}
