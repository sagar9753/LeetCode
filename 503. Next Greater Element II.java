Ques Link - https://leetcode.com/problems/next-greater-element-ii/

-------------------------------------- Solution -------------------------------------

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < n*2 ; i++){
            int ind = i % n;
            while(!st.isEmpty() && nums[st.peek()] < nums[ind])
                ans[st.pop()] = nums[ind];
            st.push(ind);
        }
        return ans;
    }
}
