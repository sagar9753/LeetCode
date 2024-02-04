Ques Link - https://leetcode.com/problems/reducing-dishes

-------------------------------------------- Solution 1 (Recursion + Memoization) ------------------------------------------------

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int dp[][] = new int[satisfaction.length+1][satisfaction.length+1];
        for(int[] row : dp)
            Arrays.fill(row,-1);
        return solve(0,satisfaction,1,dp);
    }
    public int solve(int i,int[] arr,int time,int[][] dp){
        if(i == arr.length) return 0;

        if(dp[i][time] != -1) return dp[i][time];

        int take = arr[i] * time + solve(i+1,arr,time+1,dp);
        int nottake = solve(i+1,arr,time,dp);

        return dp[i][time] = Math.max(take,nottake);
    }
}

-------------------------------------------- Solution 2 (tabulatio + space optimization) ------------------------------------------------

class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int[] next = new int[n+1];

        for(int i = n-1 ; i >= 0 ; i--){
            int[] cur = new int[n+1];
            for(int j = i ; j >= 0 ; j--){
                int take = satisfaction[i] * (j+1) + next[j+1];
                int nottake = next[j];

                cur[j] = Math.max(take,nottake);
            }
            next = cur;
        }
        return next[0];
    }
}
