Ques Link - https://leetcode.com/problems/remove-nodes-from-linked-list

----------------------------------------- Solution -------------------------------------------------------

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
    public ListNode removeNodes(ListNode head) {
        if(head == null) return null;

        head.next = removeNodes(head.next);

        if(head.next == null) 
            return head;
        else if(head.val < head.next.val)
            return head.next;
        
        return head;
    }
}
