Ques Link - https://leetcode.com/problems/count-substrings-starting-and-ending-with-given-character/

---------------------------------------------- Solution -------------------------------------------------

class Solution {
    public long countSubstrings(String s, char c) {
        long n = 0;
        for(char a : s.toCharArray())
            if(a == c)
                n++;
        return n * (n+1)/2;
    }
}
