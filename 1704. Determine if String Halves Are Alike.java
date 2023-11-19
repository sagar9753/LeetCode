Ques Link - https://leetcode.com/problems/determine-if-string-halves-are-alike/

---------------------------------- Solution ----------------------------------------

class Solution {
    public boolean halvesAreAlike(String s) {
        int i = 0,j=s.length()/2;
        int count = 0;

        for(;i < s.length()/2;i++,j++){
            count += solve(s.charAt(i));
            count -= solve(s.charAt(j));
        }
        if(count != 0)
            return false;
        return true;
    }
    public int solve(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return 1;
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
            return 1;
        return 0;
    }
}
