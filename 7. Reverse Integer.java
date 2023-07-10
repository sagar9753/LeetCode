Ques Link - https://leetcode.com/problems/reverse-integer/

------------------------------------------- Solution ---------------------------------------

class Solution {
    public int reverse(int x) {
        long ans = 0;
        int rem;
        while(x != 0){
            rem = x % 10;
            ans = 10 * ans + rem;
            x /= 10;
        }
        ans = (ans < Integer.MIN_VALUE || ans > Integer.MAX_VALUE) ? 0 : ans;
        return (int)ans;
    }
}
