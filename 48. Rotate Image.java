------------------------------------------------------- 2d Array (Medium) ----------------------------------------------------

Question Link :- https://leetcode.com/problems/rotate-image/description/

------------------------------------------------------- Solution -------------------------------------------------------------
  
class Solution {
    public void rotate(int[][] matrix) {
        int n =matrix.length;

        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-i-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[n-1-j][i];
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                matrix[j][n-1-i]=temp;
            }
        }
    }
}

----------------------------------------------------- Solution 2 --------------------------------------------------------------

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int j = 0 ; j < m-1 ; j++){
            for(int i = j+1 ; i < n ; i++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < (m+1)/2 ; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m-j-1];
                matrix[i][m-j-1] = temp;
            }
        }
    }
}
