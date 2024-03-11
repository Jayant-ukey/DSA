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
}
