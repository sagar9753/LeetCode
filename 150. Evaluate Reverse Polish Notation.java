Ques Link - https://leetcode.com/problems/evaluate-reverse-polish-notation

---------------------------------------------- Solution ---------------------------------------------------

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for(String c : tokens){
            if(c.length() > 1 || Character.isDigit(c.charAt(0)))
                st.push(Integer.parseInt(c));
            else{
                int y = st.pop();
                int x = st.pop();

                switch (c) {
                case "+":
                    st.push(x + y);
                    break;
                case "-":
                    st.push(x - y);
                    break;
                case "*":
                    st.push(x * y);
                    break;
                default:
                    st.push(x / y);
                    break;
                }
            }
        }
        return st.peek();
    }
}
