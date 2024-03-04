Ques Link - https://leetcode.com/problems/bag-of-tokens

----------------------------------------- Solution ------------------------------------------

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0,ans = 0;
        Arrays.sort(tokens);
        int l = 0, r = tokens.length - 1;

        while(l <= r){
            if(power >= tokens[l]){
                score++;
                power -= tokens[l];
                l++;
            }
            else{
                if(score == 0)
                    break;
                score--;
                power += tokens[r];
                r--;
            }
            ans = Math.max(ans,score);
        }
        return ans;
    }
}
