Ques Link - https://leetcode.com/problems/next-greater-element-i/

----------------------------------------- Solution ----------------------------------------------

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> st = new ArrayDeque<>(); 
        Map<Integer, Integer> mp = new HashMap<>();
        int[] ans = new int[nums1.length];

        for(int num : nums2){
            while(!st.isEmpty() && num > st.peek())
                mp.put(st.pop(),num);
            st.push(num);
        }
        for(int i = 0 ; i < nums1.length ; i++){
            if(mp.containsKey(nums1[i]))
                ans[i] = mp.get(nums1[i]);
            else
                ans[i] = -1;
        }
        return ans;
    }
}
