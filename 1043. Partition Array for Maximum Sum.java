Ques Link - https://leetcode.com/problems/partition-array-for-maximum-sum/

----------------------------------------- Solution -----------------------------------------------

class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[] dp = new int[arr.length];
        Arrays.fill(dp, -1);
        return solve(0,arr,k,arr.length,dp);
    }
    public int solve(int ind,int[] arr,int k,int n,int[] dp){
        if(ind == n) return 0;

        if(dp[ind] != -1) return dp[ind];
        int len = 0,max = Integer.MIN_VALUE,ans = Integer.MIN_VALUE;
        for(int i = ind ; i < Math.min(n,ind+k) ; i++){
            len++;
            max = Math.max(max,arr[i]);
            int sum = len * max + solve(i+1,arr,k,n,dp);
            ans = Math.max(sum,ans);
        }
        return dp[ind] = ans;
    }
}
