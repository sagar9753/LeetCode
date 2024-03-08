Ques Link - https://leetcode.com/problems/count-elements-with-maximum-frequency

--------------------------------------------- Solution -----------------------------------------------

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] count = new int[101];
        int max = 0;
        int ans = 0;
        for(int num : nums){
            count[num]++;
            max = Math.max(max,count[num]);
        }
        for(int num : nums){
            if(count[num] == max)
                ans++;
        }
        return ans;
    }
}
