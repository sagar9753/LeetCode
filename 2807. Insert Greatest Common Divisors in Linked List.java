Ques Link - https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/submissions/1017232799/

------------------------------------------ Solution ---------------------------------------------------

class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while(cur.next != null){
            ListNode newNode = new ListNode(divisor(cur.val,cur.next.val),cur.next);
            cur.next = newNode;
            cur = newNode.next;
        }
        return head;
    }
    public int divisor(int a,int b){
        int min = Math.min(a,b);

        while(min > 1){
            if(a%min == 0 && b%min ==0)
                return min;
            min--;
        }
        return min;
    }
}
