Ques Link - https://leetcode.com/problems/make-the-string-great/

--------------------------------------- Solution ----------------------------------------------

class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 1; i < sb.length(); i++) {
            if (Math.abs(sb.charAt(i) - sb.charAt(i - 1)) == 32) {
                sb = sb.deleteCharAt(i);
                sb = sb.deleteCharAt(i - 1);
                i = 0;
            }
        }
        return sb.toString();
    }
}
