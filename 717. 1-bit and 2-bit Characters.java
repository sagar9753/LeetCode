Ques Link - https://leetcode.com/problems/1-bit-and-2-bit-characters/

------------------------------- Solution ------------------------------

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int check = 0;
        int i ;

        for(i = 0 ; i < bits.length ;){
            if(bits[i] == 1 || i == bits.length-1){
                check = i;
                i += 2;
            }
            else
                i++;
        }
        if(check != bits.length-2)
            return true;
        return false;
    }
}
