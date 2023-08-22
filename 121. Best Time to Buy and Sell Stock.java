Ques Link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

---------------------------------------------- Solution -----------------------------------------------------

class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int prof = 0; 
        for(int i = 0 ; i < prices.length ; i++){
            if((prices[i] - min) < 0){
                min = prices[i];
            }
            else{
                prof = Math.max(prof,prices[i]-min);
            }
        }
        return prof;
    }
}
