Ques Link - https://leetcode.com/problems/assign-cookies/

------------------------------ Solution ----------------------------------

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j = 0;
        for(int i = 0 ; i < s.length && j < g.length ; i++){
            if(s[i] >= g[j])
                j++;
        }
        return j;
    }
}
