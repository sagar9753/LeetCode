Ques Link - https://leetcode.com/problems/sum-of-square-numbers

------------------------------------ Solution -------------------------------------------

class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0, r = (long)Math.sqrt(c);

        while(l <= r){
            long sumOfSqr = l*l + r*r;

            if(sumOfSqr == c)
                return true;
            else if(sumOfSqr < c)
                l++;
            else
                r--;
        }
        return false;
    }
}
