package queue_deque.day1;

import java.util.LinkedList;

public class P2QueueUsingLinkedList {

}

//https://leetcode.com/problems/implement-queue-using-stacks/

class MyQueue1 {
 LinkedList<Integer> ll;
 public MyQueue1() {
     ll = new LinkedList<>();
 }
 
 public void push(int x) {
     ll.addLast(x);
 }
 
 public int pop() {
     return ll.pollFirst();
 }
 
 public int peek() {
     return ll.getFirst();
 }
 
 public boolean empty() {
     return ll.size() == 0;
 }
}
