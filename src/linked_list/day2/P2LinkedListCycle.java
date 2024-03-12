package linked_list.day2;

// 141. Linked List Cycle :-  https://leetcode.com/problems/linked-list-cycle/

public class P2LinkedListCycle {

	
}

/**
 * Definition for singly-linked list.
*/
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 
// Approach : Here we apply the same approach of rabbit and tortoise that we applied in P1.
// Linked list is cyclic if rabbit meets tortoise again in the circular ground.
 // Complexity - O(N)
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) return true;
        }

        return false;
    }
}