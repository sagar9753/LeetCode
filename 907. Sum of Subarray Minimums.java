Ques Link - https://leetcode.com/problems/sum-of-subarray-minimums

--------------------------------------------------- Solution ---------------------------------------------------------

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        Deque<Integer> stk = new ArrayDeque<>();

        int[] prev = new int[n];
        int[] next = new int[n];
        Arrays.fill(prev,-1);
        Arrays.fill(next,n);

        for (int i = 0; i < n; ++i) {
            while (!stk.isEmpty() && arr[stk.peek()] >= arr[i]) {
                stk.pop();
            }
            if (!stk.isEmpty()) {
                prev[i] = stk.peek();
            }
            stk.push(i);
        }
        stk.clear();
        for (int i = n - 1; i >= 0; --i) {
            while (!stk.isEmpty() && arr[stk.peek()] > arr[i]) {
                stk.pop();
            }
            if (!stk.isEmpty()) {
                next[i] = stk.peek();
            }
            stk.push(i);
        }
        int mod = (int) 1e9 + 7;
        long ans = 0;
        for(int i = 0 ; i < n ; i++){
            ans += (long)arr[i] * (i - prev[i]) * (next[i] - i);
            ans %= mod;
        }
        return (int)ans;
    }
}
