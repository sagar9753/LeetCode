/*------------------------------------------------------------Question--------------------------------------------------------

Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.


Example 1:

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 2:

Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
Example 3:

Input: matrix = [[7,8],[1,2]]
Output: [7]
Explanation: 7 is the only lucky number since it is the minimum in its row and the maximum in its column.
 

Constraints:

m == mat.length
n == mat[i].length
1 <= n, m <= 50
1 <= matrix[i][j] <= 105.
All elements in the matrix are distinct.

----------------------------------------------------------Solution------------------------------------------------*/

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rowmin[]=new int[matrix.length];
        int colmax[]=new int[matrix[0].length];

        for(int row=0;row<matrix.length;row++){
            int min=Integer.MAX_VALUE;
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]<min)
                    min=matrix[row][col];
            }
            rowmin[row]=min;
        }
        for(int col=0;col<matrix[0].length;col++){
            int max=Integer.MIN_VALUE;
            for(int row=0;row<matrix.length;row++){
                if(matrix[row][col]>max)
                    max=matrix[row][col];
            }
            colmax[col]=max;
        }

        for(int i=0;i<rowmin.length;i++){
            for(int j=0;j<colmax.length;j++){
                if(rowmin[i]==colmax[j])
                    ans.add(rowmin[i]);
            }
        }
        return ans;
    }
}
