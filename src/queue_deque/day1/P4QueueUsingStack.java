package queue_deque.day1;

import java.util.Stack;

public class P4QueueUsingStack {

}

//https://leetcode.com/problems/implement-queue-using-stacks/

class MyQueue3 {
 Stack<Integer> s;
 public MyQueue3() {
     s = new Stack<>();
 }
 
 public void push(int x) {
     s.push(x);
 }
 
 public int pop() {
     Stack<Integer> temp = new Stack<>();

     while(s.size() > 0) {
         temp.push(s.peek());
         s.pop();
     }

     int frontElement = temp.peek();
     temp.pop();

     while(temp.size() > 0) {
         s.push(temp.peek());
         temp.pop();
     }

     return frontElement;
 }
 
 public int peek() {
     Stack<Integer> temp = new Stack<>();

     while(s.size() > 0) {
         temp.push(s.peek());
         s.pop();
     }

     int frontElement = temp.peek(); // just don't pop, rest same as pop()

     while(temp.size() > 0) {
         s.push(temp.peek());
         temp.pop();
     }

     return frontElement;     
 }
 
 public boolean empty() {
     return s.empty();
 }
}
