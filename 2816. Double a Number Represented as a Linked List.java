Ques Link - https://leetcode.com/problems/double-a-number-represented-as-a-linked-list

------------------------------------------ Solution ----------------------------------------------------

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
    private int carry = 0;
    public ListNode doubleIt(ListNode head) {
        head = solve(head);
        if(carry > 0){
            ListNode dummy = new ListNode(carry);
            dummy.next = head;
            return dummy;
        }
        return head;
    }
    public ListNode solve(ListNode head){
        if(head == null) return null;

        head.next = solve(head.next);

        int num = head.val * 2 + carry;
        head.val = num % 10;
        carry = num / 10;
        return head;
    }
}
