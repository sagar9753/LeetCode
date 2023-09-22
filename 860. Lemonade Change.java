Ques Link - https://leetcode.com/problems/lemonade-change/

--------------------------------- Solution ------------------------------------------

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0; 
        int ten = 0;

        for(int i = 0 ; i < bills.length ; i++){
            if(bills[i] == 5)
                five++;
            else if(bills[i] == 10){
                five--;
                ten++;
            }
            else{
                five--;
                if(ten == 0)
                    five -= 2;
                else
                    ten--;
            }

            if(five < 0)
                return false;
        }
        return true;
    }
}
