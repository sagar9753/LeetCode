Ques Link - https://leetcode.com/problems/count-the-number-of-consistent-strings/

--------------------------------------- Solution -------------------------------------------------

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] arr = new boolean[26];
        int ans = 0;
        for(char c : allowed.toCharArray())
            arr[c-'a'] = true;

        for(String str : words){
            ans += check(arr,str);
        }
        return ans;
    }
    public int check(boolean[] arr,String s){
        for(char c : s.toCharArray()){
            if(!arr[c-'a'])
                return 0;
        }
        return 1;
    }
}
