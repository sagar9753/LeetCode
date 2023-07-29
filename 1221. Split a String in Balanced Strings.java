Ques Link - https://leetcode.com/problems/split-a-string-in-balanced-strings/

------------------------------------- Solution ----------------------------------------------

class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int r = 0 ;
        int l = 0;

        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) == 'R')
                r++;
            else
                l++;
            
            if(r > 0 && r == l){
                ans++;
                r = 0;
                l = 0;
            }
            
        }
        return ans;
    }
}
