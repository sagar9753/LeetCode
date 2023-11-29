Ques Link - https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length

-------------------------------------------------- Solution ---------------------------------------------------------

class Solution {
    public int maxVowels(String s, int k) {
        int sum = 0;
        int prevsum = 0 ;
        int ans = 0;
        int j = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(isVowel(s.charAt(i)))
                sum++;
            if(i >= k ){
                if(isVowel(s.charAt(j)))
                    prevsum++;
                j++;
            }
            ans = Math.max(ans,sum-prevsum);
        }
        return ans;
    }
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            return true;
        return false;
    }
}
