---------------------------------------------- String (Easy) -------------------------------------------------------
  
Question Link :- https://leetcode.com/problems/find-the-difference/description/

--------------------------------------------- Solution ------------------------------------------------------
  
class Solution {
    public char findTheDifference(String s, String t) {
        int map[]=new int[256];
        char ans=0;

        for (final char c : s.toCharArray())
            map[c]++;

        for (final char c : t.toCharArray())
            if (--map[c] < 0){
                ans=c;
                break;
            }

        return ans;
    }
}
