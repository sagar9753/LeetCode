Ques Link - https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/

------------------------------------------- Solution ---------------------------------------------

class Solution {
    public boolean checkOnesSegment(String s) {
        
        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == '1' && s.charAt(i-1) == '0')
                return false;
        }
        return true;
    }
}
