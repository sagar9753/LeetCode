Ques Link - https://leetcode.com/problems/count-and-say

----------------------------------------------- Solution -------------------------------------------------------

class Solution {
    public String countAndSay(int n) {
        if(n == 1)
            return "1";
        String s = "1";

        for(int i = 0 ; i < n-1 ; i++)
            s = solve(s);
        return s;
    }
    public String solve(String s){
        int count;
        StringBuffer sb = new StringBuffer();
        int i = 0;
        for(; i < s.length()-1;i++){
            count = 1;
            while(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(s.charAt(i));
        }
        if(s.length() == 1 || (i < s.length() && s.charAt(i) != s.charAt(i-1))){
            sb.append(1);
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
