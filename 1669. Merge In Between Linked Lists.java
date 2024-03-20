Ques Link - https://leetcode.com/problems/merge-in-between-linked-lists

--------------------------------------- Solution --------------------------------------------

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list1;
        int count = 0;

        while(count <= b){
            if(count < a-1)
                temp1 = temp1.next;
            temp2 = temp2.next;
            count++;
        }
        temp1.next = list2;
        while(temp1.next != null)
            temp1 = temp1.next;
        temp1.next = temp2; 
        return list1;
    }
}
