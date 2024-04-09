Ques Link - https://leetcode.com/problems/time-needed-to-buy-tickets

-------------------------------------------- Solution --------------------------------------------

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0;
        int afterCount = 0;
        
        for(int i = 0 ; i < tickets.length ; i++){
            ans += Math.min(tickets[i], tickets[k]);
            if(i > k && tickets[i] >= tickets[k])
                afterCount++;
        }
        return ans - afterCount;
    }
}
