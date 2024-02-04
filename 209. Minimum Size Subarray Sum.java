Ques Link - https://leetcode.com/problems/minimum-size-subarray-sum/

--------------------------------------------- Solution --------------------------------------------------------

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = 0;
        int j = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ;i++){
            while(count < target && i < nums.length)
                count += nums[i++];
            i--;
            while(count >= target && j < nums.length){
                if(i-j+1 < ans || ans == 0)
                    ans = i-j+1;
                count -= nums[j++];
            }
            
        }
        return ans;
    }
}
