Ques Link - https://leetcode.com/problems/kth-largest-element-in-an-array

------------------------------------------------ Solution -------------------------------------------------

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Queue<Integer> heap = new PriorityQueue<>();

        for(int n : nums)
            heap.offer(n);
            
        k = nums.length-k;

        while(k-- > 0)
            heap.poll();

        return heap.peek();
    }

}
