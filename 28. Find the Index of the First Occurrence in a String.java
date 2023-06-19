--------------------------------------------------- String (Easy) ---------------------------------------------
  
Ques Link - https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

--------------------------------------------------- Solution -----------------------------------
  
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        for(int i=0;i<=n-m;i++){
            if(haystack.substring(i,i+m).equals(needle))
                return i;
        }

        return -1;
    }
}
