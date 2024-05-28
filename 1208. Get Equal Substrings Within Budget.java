Ques Link - https://leetcode.com/problems/get-equal-substrings-within-budget

------------------------------------------ Solution -----------------------------------------

class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int ans = 0;

        for(int i = 0, j = 0 ; i < s.length() ; i++){
            maxCost -= Math.abs(s.charAt(i) - t.charAt(i));

            while(maxCost < 0){
                maxCost += Math.abs(s.charAt(j) - t.charAt(j));
                j++;
            }
            ans = Math.max(ans, i-j+1);
        }
        return ans;
    }
}
