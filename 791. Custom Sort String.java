Ques Link - https://leetcode.com/problems/custom-sort-string

------------------------------------ Solution ---------------------------------------------

class Solution {
    public String customSortString(String order, String s) {
        int[] count = new int[26];
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray())
            count[c-'a']++;
        
        for(char c : order.toCharArray()){
            int i = c - 'a';
            while(count[i]-- > 0)
                sb.append(c);
        }
        for(char c : s.toCharArray()){
            int i = c - 'a';
            while(count[i]-- > 0)
                sb.append(c);
        }
        return sb.toString();
    }
}
