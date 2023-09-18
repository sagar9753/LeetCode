Ques Link - https://leetcode.com/problems/maximum-number-of-coins-you-can-get

----------------------------------- Solution ----------------------------------------

class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int ans = 0;
        int n = 0;

        for(int i = piles.length-2 ; i > n ; i-=2){
            ans += piles[i];
            n++;
        }
        
        return ans;
    }
}
