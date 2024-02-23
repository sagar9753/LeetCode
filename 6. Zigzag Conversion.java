Ques Link - https://leetcode.com/problems/zigzag-conversion/

--------------------------------------------- Solution --------------------------------------------------

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int count = numRows*2 - 2;
        
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < numRows ; i++){
            int nextPos = i == numRows-1 ? count : 2 * numRows - 2 * (i+1);
            int j = i;
            while(j < s.length()){
                ans.append(s.charAt(j));
                j += nextPos;
                nextPos = count - nextPos;
                if(nextPos == 0)
                    nextPos = count;
            }
        }
        return ans.toString();
    }
}
