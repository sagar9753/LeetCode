Ques Link - https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

----------------------------- Solution ------------------------------------

class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0, st = prices[0];

        for(int i = 1 ; i < prices.length ; i++){
            if(prices[i] > st)
                ans += prices[i] - st;
            st = prices[i];
        }
        return ans;
    }
}
