Ques Link - https://leetcode.com/problems/target-sum/

--------------------------------------------- Solution ----------------------------------------------------

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        Map<String,Integer> mp = new HashMap<>();
        return solve(nums,0,0,target,mp);
    }
    public int solve(int[] nums, int i, int sum,int tar, Map<String,Integer> mp){
        if(i == nums.length)
            return tar == sum ? 1 : 0;

        String key = i + "a" + sum;
        if(mp.containsKey(key))
            return mp.get(key); 
        int add = solve(nums,i + 1, sum + nums[i], tar,mp);
        int minus = solve(nums,i + 1, sum - nums[i], tar,mp);

        mp.put(key,add + minus);
        return add + minus;
    }
}
