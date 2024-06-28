Ques Link - https://leetcode.com/problems/maximum-total-importance-of-roads

--------------------------------- Solution --------------------------------

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        long[] count = new long[n];
        long ans = 0;

        for(int[] row : roads){
            count[row[0]]++;
            count[row[1]]++;
        }
        Arrays.sort(count);
        for(int i = 0 ; i < n ; i++){
            ans += (i+1) * count[i];
        }
        return ans;
    }
}
