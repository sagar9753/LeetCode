Ques Link - https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/

----------------------------------- Solution ----------------------------------------------

class Solution {
    public int maxDepth(String s) {
        int count = 0, ans = 0;

        for(char c : s.toCharArray()){
            if(c == '(')
                ans = Math.max(++count, ans);
            if(c == ')')
                count--;
        }
        return ans;
    }
}
