Ques Link - https://leetcode.com/problems/merge-intervals

--------------------------------------- Solution -------------------------------------------

class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();

        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        for(int i = 0 ; i < intervals.length ; i++){
            int min = intervals[i][0];
            int max = intervals[i][1];

            while(i+1 < intervals.length && intervals[i+1][0] >= min && intervals[i+1][0] <= max){
                i++;
                max = Math.max(max,intervals[i][1]);
            }
            ans.add(new int[]{min,max});
        }
        return ans.toArray(int[][] ::new);
    }
}
