package linked_list.day2;

public class P3ReverseLinkedList {

}

/**
 * Definition for singly-linked list.

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
*/
 
//Code to reverse linked list
class Solution1 {
    public ListNode reverseList(ListNode head) {
        
        //Always check head first, if head is not there then head.next will also be not there, and short circuit may arise
        if(head==null || head.next==null ) return head;
       
        ListNode prev = null, cur = head, n = head.next;

        while(cur != null){
            cur.next = prev;  //pointing cur to prev
            prev = cur;       //Making prev as cur
            cur = n;          // Making cur as next
            if(n != null) n = n.next;  // if cur next is not null then making n as n.next
        }

        return prev;
    }
}