Ques Link - https://leetcode.com/problems/clear-digits/

-------------------------------------- Solution ---------------------------------------

class Solution {
    public String clearDigits(String s) {
        char[] ch = s.toCharArray();
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < ch.length ; i++){
            if(Character.isDigit(ch[i])){
                ch[i] = '!';
                for(int j = i-1 ; j >= 0 ; j--){
                    if(ch[j] != '!'){
                        ch[j] = '!';
                        break;
                    }
                }
            }
        }
        for(char c : ch){
            if(c != '!')
                ans.append(c);
        }
        return ans.toString();
    }
}
