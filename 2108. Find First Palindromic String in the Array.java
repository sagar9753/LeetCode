Ques Link - https://leetcode.com/problems/find-first-palindromic-string-in-the-array

--------------------------------------- Solution ---------------------------------------------

class Solution {
  public String firstPalindrome(String[] words) {
    for (String word : words)
      if (isPalindrome(word))
        return word;
    return "";
  }

  public boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length()-1;
    while (i < j)
      if (s.charAt(i++) != s.charAt(j--))
        return false;
    return true;
  }
}
