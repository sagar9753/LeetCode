Ques Link - https://leetcode.com/problems/longest-substring-without-repeating-characters

--------------------------------------- Solution ------------------------------------------

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        int ans = 0;
        int start = 0;
        int[] ar = new int[128];
        Arrays.fill(ar,-1);

        for(int i = 0 ; i < s.length() ; i++){
            if(ar[s.charAt(i)] == -1){
                ar[s.charAt(i)] = i;
                count++;
            }
            else{
                if(ar[s.charAt(i)] >= start){
                    count = i - ar[s.charAt(i)];
                    start = ar[s.charAt(i)]+1;
                }
                else{
                    count++;
                }
                ar[s.charAt(i)] = i;
            }
            ans = Math.max(ans,count);
        }
        return ans;
    }
}
