Ques Link - https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/

-------------------------------------- Solution --------------------------------------

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while(head != null){
            if(head.next == null || head.val != head.next.val){
                cur.next = new ListNode(head.val);
                cur = cur.next;
            }
            while(head.next != null && head.val == head.next.val)
                head = head.next;

            head = head.next;
        }
        return dummy.next;
    }
}
