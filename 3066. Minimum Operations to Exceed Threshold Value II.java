Ques Link - https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-ii/

------------------------------------ Solution --------------------------------------

class Solution {
    public int minOperations(int[] nums, int k) {
        int ans = 0;
        Queue<Long> mh = new PriorityQueue<>();

        for(int num : nums)
            mh.add((long)num);
        while(mh.size() > 1 && mh.peek() < k){
            long x = mh.poll();
            long y = mh.poll();

            long newNum = x * 2 + y;
            mh.add(newNum);
            ans++;
        }
        return ans;
    }
}
