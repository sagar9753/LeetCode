Ques Link - https://leetcode.com/problems/counting-words-with-a-given-prefix/description/

-------------------------------------------- Solution ------------------------------------------------

class Solution {
    public int prefixCount(String[] words, String pref) {
        int plen = pref.length();
        int ans = 0;

        for(int i = 0 ; i < words.length ; i++){
            int wlen = words[i].length();

            if(wlen >= plen && pref.equals(words[i].substring(0,plen)))
                ans++;
        }
        return ans;
    }
}
