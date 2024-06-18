Ques Link - https://leetcode.com/problems/simplify-path

------------------------ Solution -----------------------------

class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        Stack<String> st = new Stack<>();

        for(String dir : dirs){
            if(dir.isEmpty() || dir.equals("."))
                continue;
            else if(dir.equals("..")){
                if(!st.isEmpty())
                    st.pop();
            }
            else
                st.push(dir);
        }
        
        return "/" + String.join("/", st);
    }
}
