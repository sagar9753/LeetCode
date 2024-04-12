Ques Link - https://leetcode.com/problems/trapping-rain-water

------------------------------------ Solution ---------------------------------------

class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int[] prefix = new int[n]; 
        int[] suffix = new int[n];
        prefix[0] = height[0];
        suffix[n-1] = height[n-1];

        for(int i = 1 ; i < n ; i++){
            prefix[i] = Math.max(height[i], prefix[i-1]);
            suffix[n-i-1] = Math.max(height[n-i-1], suffix[n-i]);
        }
        for(int i = 0 ; i < n ; i++)
            ans += Math.min(prefix[i], suffix[i]) - height[i];
        
        return ans;
    }
}
