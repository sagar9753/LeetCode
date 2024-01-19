Ques Link - https://leetcode.com/problems/minimum-falling-path-sum

---------------------------------------------------- Solution ------------------------------------------------------------

class Solution {
    public int minFallingPathSum(int[][] mat) {
        int ans = Integer.MAX_VALUE;
        int dp[][] = new int[mat.length][mat.length];
        for(int i = 0 ; i < mat.length ; i++)
            dp[0][i] = mat[0][i];
        
        for(int i = 1 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat.length ; j++){
                int m = mat[i][j] + dp[i - 1][j];

                int l = mat[i][j];
                if(j > 0)
                    l += dp[i-1][j-1];
                else
                    l += (int) Math.pow(10, 9);
                
                int r = mat[i][j];
                if(j < mat.length-1)
                    r += dp[i-1][j+1];
                else
                    r += (int) Math.pow(10, 9);

                dp[i][j] = Math.min(l, Math.min(m, r));
            }
        }

        for(int i = 0 ; i < mat.length ; i++){
            ans = Math.min(ans,dp[mat.length-1][i]);
        }
        return ans;
    }
    
}
