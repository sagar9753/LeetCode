Ques Link - https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/

------------------------------------- Solution ----------------------------------------

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
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;

        while(head != null && head.next != null){
            slow = slow.next;
            head = head.next.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
