Ques Link - https://leetcode.com/problems/best-poker-hand/description/

------------------------------------------ Solution -----------------------------------------

class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        int i;
        for(i = 1; i < 5; i++)
            if(suits[i] != suits[i-1])
                break;
        if(i==5)
            return "Flush";
            
        int[] count = new int[14];
        int max = 0;

        for(i = 0 ; i < 5 ;i++)
            if(++count[ranks[i]] > max)
                max = count[ranks[i]];

        if (max > 2)
            return "Three of a Kind";
        if (max == 2)
            return "Pair";
        return "High Card";
    }
}
