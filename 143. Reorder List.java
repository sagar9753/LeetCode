Ques Link - https://leetcode.com/problems/reorder-list

------------------------------------------- Solution ---------------------------------------------

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
    public void reorderList(ListNode head) {
        List<ListNode> ls = new ArrayList<>();
        ListNode temp = head;

        while(temp != null){
            ls.add(temp);
            temp = temp.next;
        }
        int l = 1, r = ls.size()-1;
        temp = head;

        for(int i = 0 ; l <= r ; i++){
            if(i % 2 == 0)
                temp.next = ls.get(r--);
            else
                temp.next = ls.get(l++);
            temp = temp.next;
        }
        temp.next = null;

    }
}
