Ques Link - https://leetcode.com/problems/longest-repeating-character-replacement/

----------------------------------------- Solution --------------------------------------------

class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0, ans = 0;
        int[] count = new int[26];

        for(int i = 0, j = 0 ; i < s.length() ; i++){
            max = Math.max(max, ++count[s.charAt(i) - 'A']);

            while((i - j + 1 - max) > k)
                count[s.charAt(j++) - 'A']--;

            ans = Math.max(ans, i - j + 1);
        }
        return ans;
    }
}
