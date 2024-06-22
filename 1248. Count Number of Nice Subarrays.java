Ques Link - https://leetcode.com/problems/count-number-of-nice-subarrays

-------------------------------- Solution ------------------------------------

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countSubArray(nums, k) - countSubArray(nums, k-1);
    }
    public int countSubArray(int[] nums, int k){
        int ans = 0;

        for(int i = 0, j = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 != 0)
                k--;
            
            while(k < 0){
                if(nums[j++] % 2 != 0)
                    k++;
            }
            ans += i - j;
        }
        return ans;
    }
}
