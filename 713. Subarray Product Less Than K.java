Ques Link - https://leetcode.com/problems/subarray-product-less-than-k

----------------------------------------------- Solution ---------------------------------------------------------------

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k < 2)
            return 0;
        int ans = 0;
        int product = 1;
        int i = 0,j = 0;

        while(i < nums.length){
            product *= nums[i];

            while(product >= k)
                product /= nums[j++];
            ans += i - j + 1;
            i++;
        }
        return ans;
    }
}
