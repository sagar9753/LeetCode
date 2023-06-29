------------------------------------------- Array (Easy) -------------------------------------------

Ques Link - https://leetcode.com/problems/teemo-attacking/

------------------------------------------- Solution ---------------------------------------

class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration == 0)
            return 0;
        int count=0;
        for(int i=0;i<timeSeries.length-1;i++){
            if((timeSeries[i+1] - timeSeries[i]) >= duration)
                count+=duration;
            else
                count+=(timeSeries[i+1] - timeSeries[i]);
        }
        count+=duration;
        return count;
    }
}
