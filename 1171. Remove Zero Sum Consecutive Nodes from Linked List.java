Ques Link - https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list

---------------------------------------- Solution ----------------------------------------------

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode cur = dummy;

        while(cur != null && cur.next != null){
            int sum = 0;
            ListNode temp = cur.next;
            while(temp != null){
                sum += temp.val;
                if(sum == 0)
                    cur.next = temp.next;
                temp = temp.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
