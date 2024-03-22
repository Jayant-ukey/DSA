package linked_list.day2;


//	https://leetcode.com/problems/middle-of-the-linked-list/


public class P1MiddleOfTheLinkedList {
	/**
	 * Definition for singly-linked list.
	*/
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	  	//Approach 1
	    public ListNode middleNode(ListNode head) {
	        ListNode cur = head;
	        int len = 0;
	        while(cur != null){
	            cur = cur.next;
	            len++;
	        }

	        cur = head;
	        for(int i=0;i<len/2;i++){
	            cur = cur.next;
	        }

	        return cur;
	    }
	    
	    
		/* Approach 2:-
		 * To find the middle element we are jumping fast by 2, and slow by only 1
		 * 
		 * Case 1 : even number jump for 1,2,3,4 ->from -> 1->3->NULL (when head become null slow will be at middle)
		 * 
		 * Case 2 : odd number jump for 1,2,3,4,5 -> from 1->3->5 (when fast.next become null fast will be at end)
		 */
	    public ListNode middleNode1(ListNode head) {
		    ListNode fast = head;
	        ListNode slow = head;
	
	        while(fast!=null && fast.next!=null){
	            slow = slow.next;        // tortoise
	            fast = fast.next.next;   // rabbit
	        }
	
	        return slow;
	    }
}
