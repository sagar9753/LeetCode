Ques Link - https://leetcode.com/problems/baseball-game/description/

------------------------------------------------Solution-----------------------------------------

class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack();
        int sum = 0;

        for(String s : ops){
            if(s.equals("C")){
               sum -= st.pop();
            }
            else if(s.equals("D")){
                st.push(2*st.peek());
                sum += st.peek();
            }
            else if(s.equals("+")){
                int top = st.pop();
                int newtop = top + st.peek();
                st.push(top);
                st.push(newtop);
                sum += newtop;
            }
            else{
                st.push(Integer.valueOf(s));
                sum += st.peek();
            }
        }
        return sum;
    }
}
