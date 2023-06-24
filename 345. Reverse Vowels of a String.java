--------------------------------------------- String (Easy) ------------------------------------------------

Ques Link - https://leetcode.com/problems/reverse-vowels-of-a-string/

--------------------------------------------- solution ---------------------------------------

class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() -1;
        char[] c = s.toCharArray();

        while(i < j){
            if(!isvowel(c[i])){
                i++;
                continue;
            }
            if(!isvowel(c[j])){
                j--;
                continue;
            }

            char b = c[i];
            c[i]=c[j];
            c[j]=b;

            i++;j--;
        }
        String str = String.copyValueOf(c);
        return str;
    }
    private boolean isvowel(char c){
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
}
