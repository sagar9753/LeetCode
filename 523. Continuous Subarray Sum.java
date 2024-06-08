Ques Link - https://leetcode.com/problems/continuous-subarray-sum

------------------------------- Solution -----------------------------------

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap();
        int prefix = 0;

        mp.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];

            prefix = k == 0 ? prefix : prefix % k;

            if (mp.containsKey(prefix)) {
                if (i - mp.get(prefix) > 1)
                    return true;
            } 
            else
                mp.put(prefix, i);

        }
        return false;
    }
}
