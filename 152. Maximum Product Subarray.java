Ques Link - https://leetcode.com/problems/maximum-product-subarray/

------------------------------------- Solution --------------------------------------------

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prefix = 1, suffix = 1;
        int ans = Integer.MIN_VALUE;

        for(int i = 0 ; i < n ; i++){
            prefix *= nums[i];
            suffix *= nums[n-i-1];

            ans = Math.max(ans, Math.max(prefix, suffix));

            if(prefix == 0) prefix = 1;
            if(suffix == 0) suffix = 1;
        }
        return ans;
    }
}
