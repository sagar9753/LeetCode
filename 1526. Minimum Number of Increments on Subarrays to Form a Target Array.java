Ques Link - https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array/

--------------------------------------------------- Soluion ---------------------------------------------------------

class Solution {
    public int minNumberOperations(int[] tar) {
        int ans = tar[0];
        for(int i = 1 ; i < tar.length ; i++){
            if(tar[i] > tar[i-1])
                ans += tar[i] - tar[i-1];
        }
        return ans;
    }
}
