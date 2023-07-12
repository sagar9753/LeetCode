Ques Link - https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/

------------------------------------------- Solution --------------------------------------------

class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0 ;

        for(String s : sentences){
            int count = s.split(" ").length;

            if(count > max)
                max = count;
        }
        return max;
    }
}
