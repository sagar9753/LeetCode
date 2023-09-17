Ques Link - https://leetcode.com/problems/rotate-string/

----------------------------- Solution -------------------------------

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        s += s;
        int n = goal.length();
        int i = 0;
        while(i+n < s.length()){
            if(s.substring(i,i+n).equals(goal))
                return true;
            i++;
        }
        return false;
    }
}
