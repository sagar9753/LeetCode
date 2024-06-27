Ques Link - https://leetcode.com/problems/maximum-repeating-substring/description/

--------------------------------- Solution -------------------------------------

class Solution {
    public int maxRepeating(String sequence, String word) {
        int ans = 0;
        StringBuilder check = new StringBuilder();

        check.append(word);
        while (sequence.contains(check)) {
            ans++;
            check.append(word);
        }

        return ans;
    }
}
