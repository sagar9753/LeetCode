Ques Link - https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/

------------------------------------------------ Solution -----------------------------------------------------

class Solution {
    public int[] minOperations(String box) {
        int cr = 0; int cri = 0;
        int cl = 0; int cli = 0;
        int[] ans = new int[box.length()];

        for(int i = 0 ; i < box.length() ; i++){
            int n = box.charAt(i) - '0';
            if(n == 1){
                cr = cr + (i-0);
                cri++;
            }
        }
        for(int i = 0 ; i < box.length() ; i++){
            ans[i] = Math.abs(cr) + Math.abs(cl);
            int n = box.charAt(i) - '0';
            if(n == 1){
                cri--;
                cli++;
            }
            cr -= cri;
            cl -= cli;
        }
        return ans;
    }
}
