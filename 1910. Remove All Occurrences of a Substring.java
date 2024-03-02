Ques Link - https://leetcode.com/problems/remove-all-occurrences-of-a-substring

-------------------------------------- Solution -----------------------------------------------------

class Solution {
    public String removeOccurrences(String s, String part) {
        int slen = s.length();
        int plen = part.length();

        StringBuilder sb = new StringBuilder(s);
        int i = 0;

        for(char c : s.toCharArray()){
            sb.setCharAt(i++,c);
            if(i >= plen && sb.substring(i-plen,i).toString().equals(part))
                i -= plen;
        }
        return sb.substring(0,i).toString();
    }
}
