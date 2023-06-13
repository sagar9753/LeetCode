-------------------------------------------- LinkedList (Easy) ---------------------------
  
Que Link - https://leetcode.com/problems/remove-linked-list-elements/

-------------------------------------------- Solution 1 ----------------------------------

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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;

        ListNode temp = head;
        ListNode t = temp.next;

        while(t != null){
            if(t.val == val){
                temp.next = t.next;
                t=t.next;
            }
            else{
                t=t.next;
                temp = temp.next;
            }
        }

        if(head.val == val)
            head=head.next;
        
        return head;
    }
}

-------------------------------------------- Solution 2 ----------------------------------------------------
  
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode sample = new ListNode(0,head);
        ListNode prev = sample;

        while(head != null){
            if(head.val != val){
                prev.next=head;
                prev=prev.next;
            }
            head=head.next;
        }
        prev.next=null;

        return sample.next;
    }
}
