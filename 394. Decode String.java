Ques Link - https://leetcode.com/problems/decode-string/

-------------------------------------------- Solution ----------------------------------------

class Solution {
    private int i = 0;
    public String decodeString(String s) {
        StringBuilder ans = new StringBuilder();

        while(i < s.length() && s.charAt(i) != ']'){
            if(Character.isDigit(s.charAt(i))){
                int num = 0;
                while(s.charAt(i) != '[')
                    num = num * 10 + (s.charAt(i++) - '0');
                i++;

                String dec = decodeString(s);
                i++;
                while(num-- > 0)
                    ans.append(dec);
            }
            else{
                ans.append(s.charAt(i++));
            }
        }
        return ans.toString();
    }
}
