Ques Link - https://leetcode.com/problems/rearrange-array-elements-by-sign/

------------------------------------------- Solution --------------------------------------------

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];
        int c = 0;
        int k = 1;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > 0){
                ans[c] = nums[i];
                c += 2;
            }
            else{
                ans[k] = nums[i];
                k += 2;
            }
        }
        return ans;
    }
}
