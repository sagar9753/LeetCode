Ques Link - https://leetcode.com/problems/subarrays-with-k-different-integers

------------------------------------ Solution ----------------------------------------------

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return (solve(nums, k) - solve(nums, k-1));
    }
    public int solve(int[] nums, int k){
        int[] count = new int[nums.length + 1];
        int ans = 0;

        for(int i = 0, j = 0 ; i < nums.length ; i++){
            if(count[nums[i]]++ == 0)
                k--;
            while(k < 0){
                if(count[nums[j++]]-- == 1)
                    k++;
            }
            ans += i - j + 1;
        }
        return ans;
    }
}
