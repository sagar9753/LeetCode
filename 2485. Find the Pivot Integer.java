Ques Link - https://leetcode.com/problems/find-the-pivot-integer

---------------------------------------- Solution ------------------------------------------

class Solution {
    public int pivotInteger(int n) {
        int rightSum = n * (n + 1) / 2;
        int leftSum = 0;

        for(int i = 1 ; i <= n ; i++){
            leftSum += i;
            if(leftSum == rightSum)
                return i;
            rightSum -= i;
        }
        return -1;
    }
}
