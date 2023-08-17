Ques Link - https://leetcode.com/problems/number-of-lines-to-write-string/description/

------------------------------------- Solution -------------------------------------

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] ans = new int[2];

        for(int i = 0 ; i < s.length() ; i++){
            int a = widths[s.charAt(i)-'a'];
            if((ans[1]+a) > 100){
                ans[0]++;
                ans[1]  = 0;
            }
            ans[1] += a;
        }
        ans[0]++;
        return ans;
    }
}
