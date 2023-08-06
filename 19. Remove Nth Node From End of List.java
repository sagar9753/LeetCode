Ques Link - https://leetcode.com/problems/remove-nth-node-from-end-of-list/

---------------------------------------- Solution -------------------------------------

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode sample = new ListNode(0);
        sample.next = head;
        ListNode prev = sample;
        ListNode t = head.next;
        int count = 0;

        while(head != null){
            if(count++ >= n){
                prev = prev.next;
                t = t.next;
            }
            head = head.next;
        }
        if(n == 1){
            prev.next = null;
            return sample.next;
        }
        prev.next = t;
        return sample.next;

    }
}
