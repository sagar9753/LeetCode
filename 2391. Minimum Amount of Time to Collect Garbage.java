Ques Link - https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/

----------------------------------------------- Solution -------------------------------------------------------

class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int[] prefix = new int[garbage.length];
        int ans = 0;
        prefix[0] = 0;
        for(int i = 1 ; i < travel.length + 1 ; i++)
            prefix[i] = prefix[i-1] + travel[i-1];
        int plast = 0,glast = 0,mlast = 0;

        for(int i = 0 ; i < garbage.length ; i++){
            String s = garbage[i];
            ans += s.length();
            for(int j = 0 ; j < s.length() ; j++){
                if(plast != i && s.charAt(j) == 'P')
                    plast = i;
                if(glast != i && s.charAt(j) == 'G')
                    glast = i;
                if(mlast != i && s.charAt(j) == 'M')
                    mlast = i;
            }
        }
        ans += prefix[plast] + prefix[mlast] + prefix[glast];
        return ans;
    }
}
