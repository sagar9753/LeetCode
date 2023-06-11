----------------------------------------------- Linked List (Easy) -------------------------------

Ques Link - https://leetcode.com/problems/middle-of-the-linked-list/description/

----------------------------------------------- Solution 1 -----------------------------------------
  
        ListNode slow=head;
        ListNode fast=head;
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;

---------------------------------------------- Solution 2 -------------------------------------------
  
        ListNode temp=head;
        int count=0;
        while(temp != null){
            temp=temp.next;
            count++;
        }
        count=count/2;
        temp=head;
        while(count>0){
            temp=temp.next;
            count--;
        }

        return temp;
