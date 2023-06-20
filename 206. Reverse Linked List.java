------------------------------------------------- Linked List (Easy) ------------------------------------------------------
  
Ques Link - https://leetcode.com/problems/reverse-linked-list/description/

------------------------------------------------ Solution ---------------------------------------------------
  
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode next = head;

        while(next != null){
            next=next.next;
            head.next=prev;
            prev=head;
            head=next;
        }

        return prev;
    }
}
