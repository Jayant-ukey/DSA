package linked_list.day3;

public class P1IntersectionTwoLinkedList {

}

/**
 * Definition for singly-linked list.
 * 
 * 160. Intersection of Two Linked Lists:-  https://leetcode.com/problems/intersection-of-two-linked-lists/
 */

   class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
class Solution {

    public int getLength(ListNode head){
        int len = 0;
        while(head != null){
            head = head.next;
            len++;
        }
        return len;
    }

     public ListNode giveTheEdge(ListNode head, int extra){
        while(extra-- > 0){
            head = head.next;
        }
        return head;
     }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);

        ListNode curA = headA;
        ListNode curB = headB;

        if(len1 > len2)
            curA = giveTheEdge(headA, len1-len2);

        else 
            curB = giveTheEdge(headB, len2-len1);


        while(curA != curB){
            curA = curA.next;
            curB = curB.next;
        }

        return curA;

    }
}