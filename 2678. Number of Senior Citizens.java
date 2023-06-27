------------------------------------------ String (Easy)------------------------------------

Ques link - https://leetcode.com/problems/number-of-senior-citizens/description/

------------------------------------------ Solution --------------------------------------

class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i = 0 ; i < details.length; i++){
            if(Integer.parseInt(details[i].substring(11,13)) > 60)
                count++;
        }
        return count;
    }
}
