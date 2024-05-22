Ques Link - https://leetcode.com/problems/palindrome-partitioning

----------------------------------- Solution ---------------------------------------

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(ans, new ArrayList<>(), 0, s);
        return ans;
    }

    public void solve(List<List<String>> ans, List<String> arr, int ind, String s) {
        if (ind == s.length()) {
            ans.add(new ArrayList(arr));
            return;
        }
        String str = "";
        for (int i = ind; i < s.length(); i++) {
            str = s.substring(ind, i+1);
            if (isPalindrome(str)) {
                arr.add(str);
                solve(ans, arr, i + 1, s);
                arr.remove(arr.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        int l = 0, r = s.length()-1;
        while (l < r)
            if (s.charAt(l++) != s.charAt(r--))
                return false;
        return true;
    }
}
