------------------------------------------- string(Easy) ---------------------------------------------------

Ques Link - https://leetcode.com/problems/shuffle-string/description/

------------------------------------------- Solution ------------------------------------------------------

class Solution {
    public String restoreString(String s, int[] indices) {
        char[] c = new char[indices.length];

        for(int i = 0; i<indices.length;i++){
            c[indices[i]] = s.charAt(i);
        }
        return String.copyValueOf(c); 
    }
}
