Ques Link - https://leetcode.com/problems/minimum-falling-path-sum

----------------------------------------- Solution 1(DP Tabulation) ------------------------------------------------------------

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

--------------------------------------------------- Solution (DP Space Optimization) ----------------------------------------------------

class Solution {
    public int minFallingPathSum(int[][] mat) {
        int ans = Integer.MAX_VALUE;
        
        for(int i = 1 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat.length ; j++){
                int min = (int) Math.pow(10, 9);
                for(int k = Math.max(0,j-1) ; k < Math.min(mat.length,j+2) ; k++)
                    min = Math.min(min,mat[i-1][k]);
                mat[i][j] += min;
            }
        }

        for(int i = 0 ; i < mat.length ; i++){
            ans = Math.min(ans,mat[mat.length-1][i]);
        }
        return ans;
    }
    
}
