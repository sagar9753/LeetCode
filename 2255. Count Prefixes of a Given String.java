Ques Link - https://leetcode.com/problems/count-prefixes-of-a-given-string/submissions/

--------------------------------------------- Solution ---------------------------------------------

class Solution {
    public int countPrefixes(String[] words, String s) {
        int ans = 0;
        int slen = s.length();
        for(String str : words){
            int l = str.length();

            if(l <= slen && s.substring(0,l).equals(str))
                ans++;
        }
        return ans;
    }
}
