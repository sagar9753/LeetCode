Ques Link - https://leetcode.com/problems/valid-anagram/

------------------------------------------ Solution ---------------------------------------------

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] count = new int[128];

        for(char c : s.toCharArray())
            count[c]++;

        for(char c : t.toCharArray())
            if(--count[c] < 0)
                return false;

        return true;
        
    }
}
