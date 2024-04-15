Ques Link - https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/

----------------------------------------- Solution -----------------------------------------------

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(sb.length() > 0 && sb.charAt(sb.length() - 1) == c)
                sb.deleteCharAt(sb.length() - 1);
            else
                sb.append(c);
        }
        return sb.toString();
    }
}
