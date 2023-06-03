--------------------------------------------- Array(Easy) -------------------------------------------
  
Ques Link - https://leetcode.com/problems/buy-two-chocolates/description/

--------------------------------------------- Solution ----------------------------------------------
  
class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int ps : prices){
            if(ps<=min1){
                min2=min1;
                min1=ps;
            }
            else if(ps<min2)
                min2=ps;
        }
        int cost=min1+min2;

        return cost>money ? money : money-cost;
    }
}
