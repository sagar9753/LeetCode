Ques Link - https://leetcode.com/problems/word-break-ii

------------------------------------------- Solution -----------------------------------------------------

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> ans = new ArrayList<>();
        List<String> check = new ArrayList<>();
        solve(ans, check, s, wordDict, 0);

        return ans;
    }

    public void solve(List<String> ans, List<String> check, String s, List<String> wordDict, int ind) {
        if (ind == s.length()) {
            ans.add(String.join(" ", check));
            return;
        }

        StringBuilder str = new StringBuilder();
        for (int i = ind; i < s.length(); i++) {
            str.append(s.charAt(i));
            if (wordDict.contains(str.toString())) {
                check.add(str.toString());
                solve(ans, check, s, wordDict, i + 1);
                if (check.size() > 0)
                    check.remove(check.size() - 1);
            }
        }
    }
}
