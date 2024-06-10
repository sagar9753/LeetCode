Ques Link - https://leetcode.com/problems/height-checker

---------------------------------- Solution -------------------------------

class Solution {
    public int heightChecker(int[] heights) {
        int[] exp = new int[heights.length];
        int i = 0,ans = 0;

        for(int n : heights)
            exp[i++] = n;
        Arrays.sort(exp);
        for(i = 0 ; i < heights.length ; i++){
            if(exp[i] != heights[i])
                ans++;
        }
        return ans;
    }
}
