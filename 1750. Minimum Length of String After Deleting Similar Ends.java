Ques Link - https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends

---------------------------------------- Solution ----------------------------------------

class Solution {
    public int minimumLength(String s) {
        int l = 0, r = s.length()-1;

        while(l < r){
            if(s.charAt(l) != s.charAt(r))
                break;
            while(l+1 < r && s.charAt(l) == s.charAt(l+1))
                l++;
            while(r-1 > l && s.charAt(r) == s.charAt(r-1))
                r--;
            l++;r--;
        }
        return r-l+1;
    }
}
