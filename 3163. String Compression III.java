Ques Link - https://leetcode.com/problems/string-compression-iii/

--------------------------------- Solution ---------------------------------------

class Solution {
    public String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0 ; i < word.length() ; i++){
            int count = 1;
            while(i < word.length()-1 && word.charAt(i) == word.charAt(i+1) && count < 9){
                count++;
                i++;
            }
            ans.append(count);
            ans.append(word.charAt(i));
        }
        return ans.toString();
    }
}
