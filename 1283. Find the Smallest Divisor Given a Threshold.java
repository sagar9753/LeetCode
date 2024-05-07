Ques Link - https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/

-------------------------------------------- Solution ------------------------------------------------------

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MIN_VALUE, mid;
        for(int num : nums)
            high = Math.max(high, num);

        while(low <= high){
            mid = (low + high) / 2;

            if(possible(nums, threshold, mid)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean possible(int[] nums, int th, int div){
        int sum = 0;
        for(int num : nums)
            sum += Math.ceil((double)(num) / (double)(div));
        return sum <= th ? true : false;
    }
}
