Ques Link - https://leetcode.com/problems/sum-of-digits-of-string-after-convert/submissions/989827477/

------------------------------------------ Solution -------------------------------------------

class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(c - 'a' + 1));
        }
        s = sb.toString();
        while (k-- > 0) {
            int sum = 0;
            for (char c : s.toCharArray()) {
                sum += c - '0';
            }
            s = String.valueOf(sum);
        }
        return Integer.parseInt(s);
    }
}
