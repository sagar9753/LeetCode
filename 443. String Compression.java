Ques Link - https://leetcode.com/problems/string-compression

----------------------------------------- Solution --------------------------------------------

class Solution {
    public int compress(char[] chars) {
        int count = 1;
        int j = 0;

        for(int i = 0 ; i < chars.length ; i++){
            if(i < chars.length-1 && chars[i] == chars[i+1]){
                count++;
                continue;
            }
            chars[j++] = chars[i];

            if(count > 1){
                for(char c : String.valueOf(count).toCharArray())
                    chars[j++] = c;
            }
            count = 1;
        }
        return j;
    }
}
