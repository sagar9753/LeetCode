Ques Link - https://leetcode.com/problems/max-consecutive-ones-iii/

----------------------------------------------- Solution ---------------------------------------------------------

class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = Integer.MIN_VALUE;
        int j = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0)
                k--;
            if(k < 0){
                while(nums[j] != 0)
                    j++;
                j++;
                k++;
            }
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}
