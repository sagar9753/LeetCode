Ques Link - https://leetcode.com/problems/maximum-average-subarray-i

------------------------------------- Solution ---------------------------------------------------

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max;

        for(int i = 0 ; i < k ; i++)
            sum += nums[i] ;
        max = sum;

        for(int i = k ; i < nums.length ; i++){
            sum += nums[i] - nums[i-k];
            max = Math.max(sum,max);
        }
        return max/k;
    }
}
