Ques Link - https://leetcode.com/problems/set-matrix-zeroes/

-------------------------------------------------- Solution -----------------------------------------------------

class Solution {
    public void setZeroes(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(mat[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0 ; i < n ; i++)
            if(row[i] == 1)
                Arrays.fill(mat[i],0);
        
        for(int i = 0 ; i < m ; i++){
            if(col[i] == 1){
                for(int j = 0 ; j < n ; j++)
                    mat[j][i] = 0;
            }
        }
    }
}
