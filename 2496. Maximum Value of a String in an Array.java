Ques Link - https://leetcode.com/problems/maximum-value-of-a-string-in-an-array/

----------------------------------- Solution --------------------------------------------

class Solution {
    public int maximumValue(String[] strs) {
        int ans = 0 ;

        for(String s : strs){
            ans  = Math.max(ans,solve(s));
        }
        return ans; 
    }
    public int solve(String s){
        for(char a : s.toCharArray()){
            if(a >= 'a' && a <= 'z')
                return s.length();
        }
        return Integer.parseInt(s);
    }
}
