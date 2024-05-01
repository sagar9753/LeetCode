Ques Link - https://leetcode.com/problems/reverse-prefix-of-word

-------------------------------------- Solution ----------------------------------------------

class Solution {
    public String reversePrefix(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                return new StringBuilder(word.substring(0, i + 1)).reverse().toString() + word.substring(i + 1);
            }
        }
        return word;
    }
}
