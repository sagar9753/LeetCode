Ques link - https://leetcode.com/problems/maximize-happiness-of-selected-children/

------------------------------------------ solution ----------------------------------------------------

class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        Arrays.sort(hap);
        long ans = 0, count = 0;
        int i = hap.length-1;
        while(k-- > 0){
            if(hap[i] - count <= 0)
                break;
            ans += hap[i] - count;
            count++;
            i--;
        }
        return ans;
    }
}
