Ques Link - https://leetcode.com/problems/reverse-words-in-a-string/

-------------------------------------- Solution -------------------------------------------

class Solution {
    public String reverseWords(String s) {
        int n = s.length()-1;
        int i = 0,j = n;
        while(s.charAt(i) == ' ' && i <= n)
            i++;
        while(s.charAt(j) == ' ' && j >= 0)
            j--;
        if(i > j)
            return "";
        s = s.substring(i,j+1);
        n = s.length()-1;
        String ans = "";

        for(i = n,j = n ; i >= 0 ; i--){
            if(s.charAt(i) == ' '){
                ans += s.substring(i,j+1);
                while(s.charAt(i) == ' ')
                    i--;
                j = i;
            }
        }
        ans += " " + s.substring(i+1,j+1);
        if(ans.charAt(0) == ' ')
            ans = ans.substring(1);
        
        return ans;
    }
}
