Ques Link - https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/

------------------------------------ Solution ---------------------------------------------

class Solution {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)
            ans = Math.max(ans, solve(energy, i, k, dp));
        return ans;
    }

    public int solve(int arr[], int i, int k, int dp[]) {
        if (i >= arr.length)
            return 0;
        int take = 0;
        if (dp[i] != -1)
            return dp[i];
        take = arr[i] + solve(arr, i + k, k, dp);
        return dp[i] = take;
    }
}
