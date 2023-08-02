Ques Link - https://leetcode.com/problems/ransom-note/submissions/?envType=study-plan-v2&envId=top-interview-150

-------------------------------------------- Solution ----------------------------------------------------------

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[128];

        for(int i = 0 ; i < magazine.length() ; i++)
            count[magazine.charAt(i)]++;

        for(int i = 0 ; i < ransomNote.length() ; i++){
            if(count[ransomNote.charAt(i)] == 0)
                return false;
            count[ransomNote.charAt(i)]--;
        }
        return true;
    }
}
