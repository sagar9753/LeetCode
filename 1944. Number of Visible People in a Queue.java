Ques Link - https://leetcode.com/problems/number-of-visible-people-in-a-queue/

----------------------------------------- Solution ------------------------------------------

class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int[] ans = new int[heights.length];
        Deque<Integer> st = new ArrayDeque<>();

        for(int i = heights.length-1; i >= 0 ; i--){
            int count = 0;
            while(!st.isEmpty() && st.peek() < heights[i]){
                count++;
                st.pop();
            }
            if(!st.isEmpty())
                count++;
            ans[i] = count;
            st.push(heights[i]);
        }
        return ans;
    }
}
