Ques Link - https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/description/

-------------------------------------------- Solution -------------------------------------------------

class Solution {
    public int minSteps(String s, String t) {
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        int ans = 0;

        for(int i = 0 ; i < s.length() ; i++){
            count1[s.charAt(i)-'a']++;
            count2[t.charAt(i)-'a']++;
        }
        for(int i = 0 ; i < s.length() ; i++){
            int a = s.charAt(i) - 'a';
            if(count1[a] > count2[a]){
                ans += (count1[a] - count2[a]);
                count1[a] = count2[a];
            }
        }
        return ans;
    }
}
