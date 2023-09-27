Ques Link - https://leetcode.com/problems/valid-parentheses/

--------------------------------------- Solution --------------------------------------------

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '(')
                st.push(')');
            else if(c == '{')
                st.push('}');
            else if(c == '[')
                st.push(']');
            else if(st.empty() || c != st.peek())
                return false;
            else
                st.pop();
        }
        return st.empty();
    }
}
