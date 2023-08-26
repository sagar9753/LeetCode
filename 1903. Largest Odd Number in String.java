Ques Link - https://leetcode.com/problems/largest-odd-number-in-string/description/

------------------------------------- Solution -----------------------------------------

class Solution {
    public String largestOddNumber(String num) {
        int i = num.length()-1;

        for(;i >= 0 ; i--){
            int a = num.charAt(i) - '0';
            if(a % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}
