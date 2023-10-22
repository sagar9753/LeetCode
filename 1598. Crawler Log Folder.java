Ques Link - https://leetcode.com/problems/crawler-log-folder/

-------------------------------------------------------- Solution -------------------------------------------------------

class Solution {
    public int minOperations(String[] logs) {
        int step = 0 ;

        for(String s : logs){
            if(s.equals("../") && step != 0)
                step--;
            
            if(!s.equals("./") && !s.equals("../"))
                step++;
        }
        return step;
    }
}
