------------------------------------------------- Linked List (Easy) ------------------------------------------
  
Question Link :- https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

------------------------------------------------ Solution ----------------------------------------------------
  
  /*
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
        if(head==null)
            return head;
        ListNode temp=head;
        ListNode t=head.next;

        while(t != null){
            if(temp.val != t.val){
                temp.next=t;
                temp=t;
            }
            t=t.next;
        }
        temp.next=null;
        return head;
    }
}
