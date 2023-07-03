Ques Link - https://leetcode.com/problems/counting-bits/description/

---------------------------------------------- Solution ---------------------------------------

class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        
        for(int i=0;i<ans.length;i++){
            int a = i>>1;
            if(i%2 == 0)
                ans[i] = ans[a];
            else
                ans[i] = ans[a] + 1;
        }
        return ans;
    }
}
