Ques Link - https://leetcode.com/problems/minimum-window-substring/

---------------------------------------- Solution ------------------------------------------

class Solution {
    public String minWindow(String s, String t) {
        int[] count1 = new int[128];
        int[] count2 = new int[128];

        for(char c : t.toCharArray())
            count1[c]++;
        
        int count = 0; int j = 0,i;
        int min = Integer.MAX_VALUE;
        int k = -1;
        for(i = 0 ; i < s.length() ; i++){
            count2[s.charAt(i)]++;
            if(count1[s.charAt(i)] >= count2[s.charAt(i)])
                count++;
            
            while(count == t.length()){
                if(i-j+1 < min){
                    k = j;
                    min = i-j+1;
                }
                if(count1[s.charAt(j)] == count2[s.charAt(j)])
                    count--;
                count2[s.charAt(j++)]--;
            }
        }
        return k < 0 ? "" : s.substring(k, k + min);
    }
}
