Ques Link - https://leetcode.com/problems/longest-palindrome

--------------------------------------------------- Solution --------------------------------------------------

class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        boolean check = false;
        int ans = 0;

        for(char c : s.toCharArray())
            count[c]++;
        
        for(int freq : count){
            if(!check && freq % 2 == 1)
                check = true;
            ans += freq % 2 == 0 ? freq : freq - 1;
        }
        return check ? ans + 1 : ans;
    }
}
