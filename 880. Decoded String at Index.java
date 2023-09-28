Ques Link - https://leetcode.com/problems/decoded-string-at-index

---------------------------------------- Solution ---------------------------------------------

class Solution {
    public String decodeAtIndex(String s, int k) {
        long n = 0; 
        int i = 0;
        while(n < k){
            if(Character.isDigit(s.charAt(i)))
                n *= s.charAt(i) - '0';
            else
                n++;
            i++;
        }
        i--;
        for(; i >= 0 ; i--){
            k %= n;
            if(k==0 && Character.isAlphabetic(s.charAt(i)))
                return s.substring(i,i+1);
            if(Character.isDigit(s.charAt(i)))
                n /= s.charAt(i) - '0';
            else
                n--;
        }
        return "0";
    }
}
