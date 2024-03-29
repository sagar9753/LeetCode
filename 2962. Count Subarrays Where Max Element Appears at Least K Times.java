Ques Link - https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times

--------------------------------------- Solution ------------------------------------------------

class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = -1;
        int n = nums.length;
        long ans = 0;
        int cnt = 0;

        for(int i = 0 ; i < n ; i++)
            max = Math.max(max,nums[i]);
            
        for(int i = 0,j = 0 ; i < n ; i++){
            cnt += nums[i] == max ? 1 : 0;
            while(cnt == k){
                cnt -= nums[j] == max ? 1 : 0;
                j++;
            }
            ans += j;
        }
        return ans;
    }
}
