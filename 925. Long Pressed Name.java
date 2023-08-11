Ques Link - https://leetcode.com/problems/long-pressed-name/submissions/

---------------------------------------- Solution ----------------------------------------

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0,j = 0 ;
        while(i < name.length() && j < typed.length()){
            if(name.charAt(i) == typed.charAt(j)){
                i++;j++;
            }
            else if(j > 0 && typed.charAt(j-1) == typed.charAt(j)){
                j++;
            }
            else 
                return false;
        }
        if(i != name.length())
            return false;
            
        while(j < typed.length()){
            if(name.charAt(i-1) != typed.charAt(j))
                return false;
            j++;
        }
        return true;
    }
}
