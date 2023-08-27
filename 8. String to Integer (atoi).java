Ques Link - https://leetcode.com/problems/string-to-integer-atoi/description/

---------------------------------- Solution -----------------------------------------

class Solution {
    public int myAtoi(String s) {
        s = s.strip();
        if(s.isEmpty())
            return 0;
        int sign = s.charAt(0) == '-' ? -1 : 1;
        if(s.charAt(0) == '+' || s.charAt(0) == '-')
            s = s.substring(1);

        int i = 0;
        long num = 0;
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            num = num*10 + (s.charAt(i) - '0');
            if(sign*num <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE; 
            if(sign*num >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            i++;
        }
         
        return sign*(int)num;
    }
}
