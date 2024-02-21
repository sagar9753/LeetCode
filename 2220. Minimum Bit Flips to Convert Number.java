Ques Link - https://leetcode.com/problems/minimum-bit-flips-to-convert-number/

-------------------------------------------- Solution ------------------------------------------------

class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0;
        while(start != goal){
            int sLastBit = start & 1;
            int gLastBit = goal & 1;

            if(sLastBit != gLastBit)
                ans++;
            start >>= 1;
            goal >>= 1;
        }
        return ans;
    }
}
