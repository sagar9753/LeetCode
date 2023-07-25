Ques Link - https://leetcode.com/problems/sorting-the-sentence/

---------------------------------------- Solution -------------------------------------------

class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for(int i = 0 ; i < words.length ; i++){
            int l = words[i].length()-1;
            int a = words[i].charAt(l) - '1';
            ans[a] = words[i].substring(0,l);
        }
        return String.join(" ", ans);
    }
}
