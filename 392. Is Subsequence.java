Ques Link - https://leetcode.com/problems/is-subsequence/description/

-------------------------------------------- Solution ------------------------------------------------------

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;int j=0;int c=0;
        while(j<t.length() && i<s.length())
        {
            if(s.charAt(i) == t.charAt(j))
            {
                i++;c++;
            }
            j++;
        }
        if(c==s.length())
            return true;
        return false;
    }
}
