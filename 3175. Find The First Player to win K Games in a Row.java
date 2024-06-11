Ques Link - https://leetcode.com/problems/find-the-first-player-to-win-k-games-in-a-row/

------------------------------------------ Solution ------------------------------------------------

class Solution {
    public int findWinningPlayer(int[] skills, int k) {
        int cur = 0,count = 0;

        for(int i = 1 ; i < skills.length ; i++){
            if(skills[i] > skills[cur]){
                cur = i;
                count = 1;
            }
            else
                count++;

            if(count == k)
                return cur;
        }
        return cur;
    }
}
