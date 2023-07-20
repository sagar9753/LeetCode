Ques Link - https://leetcode.com/problems/find-the-highest-altitude/description/

-------------------------------------------- Solution -----------------------------------------------------

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int prev = 0;

        for(int i = 0 ; i < gain.length; i++){
            prev += gain[i];
            if(prev > max)
                max = prev;
        }
        return max;
    }
}
