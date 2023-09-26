Ques Link - https://leetcode.com/problems/palindrome-number/

----------------------------------- Solution -----------------------------------

class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int rev = 0;
        int X = x;

        while(x != 0){
            int n = x % 10;
            rev = rev * 10 + n;
            x /= 10;
        }

        return X == rev;
    }
}
