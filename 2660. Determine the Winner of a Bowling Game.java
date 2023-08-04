Ques Link - https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/

---------------------------------------- Solution ------------------------------------------

class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = score(player1);
        int score2 = score(player2);

        if(score1 > score2)
            return 1;
        if(score2 > score1)
            return 2;
        return 0;
    }
    public int score(int[] plyr){
        int check = -3;
        int ans = 0;

        for(int i = 0 ; i < plyr.length ; i++){
            if(check >= i-2)
                ans += plyr[i];
            ans += plyr[i];

            if(plyr[i] == 10)
                check = i;
        }
        return ans;
    }
}
