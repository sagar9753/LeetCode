Ques Link - https://leetcode.com/problems/subarray-sum-equals-k

------------------------------------------ Solution -------------------------------------------

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map <Integer,Integer> hm = new HashMap<Integer,Integer>();
        int ans = 0;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];

            if(sum == k)
                ans++;
            
            if(hm.containsKey(sum-k))
                ans += hm.get(sum-k);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
