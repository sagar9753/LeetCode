Ques Link - https://leetcode.com/problems/optimal-partition-of-string/description/

----------------------------------- Solution -----------------------------------------

class Solution {
    public int partitionString(String s) {
        int[] count = new int[26];
        int ans = 1 ;

        for(int i = 0 ; i < s.length() ; i++){
            if(count[s.charAt(i)-'a'] == 1){
                Arrays.fill(count,0);
                ans++;
            }
            count[s.charAt(i)-'a']++;
        }
        return ans;
    }
}
