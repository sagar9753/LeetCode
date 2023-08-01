Ques Link - https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=top-interview-150

---------------------------------------------- Solution ------------------------------------------------

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        prefix[0] = 1;
        suffix[n-1] = 1;

        for(int i = 1,j = n-2 ; i < n ; i++,j--){
            prefix[i] = nums[i-1] * prefix[i-1];
            suffix[j] = nums[j+1] * suffix[j+1];
        }

        for(int i = 0 ; i < n ; i++)
            nums[i] = prefix[i] * suffix[i];
        
        return nums;
    }
}
