Ques Link - https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/

----------------------------------------- Solution -------------------------------------------------

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (arr1,arr2) -> Integer.compare(arr1[1],arr2[1]));
        int j = points[0][1];
        int ans = 1;

        for(int i = 1 ; i < points.length ; i++){
            if(points[i][0] <= j)
                continue;
            j = points[i][1];
            ans++;
        }
        return ans;
    }
}
