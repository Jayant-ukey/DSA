package queue_deque.day1;

import java.util.ArrayList;

public class P1QueueUsingArrayList {

}

//https://leetcode.com/problems/implement-queue-using-stacks/
class MyQueue {

    ArrayList<Integer> arr;
    int fp;
    public MyQueue() {
        arr =new ArrayList<>();
        fp = 0;
    }
    
    public void push(int x) {
        arr.add(x);
    }
    
    public int pop() {
        int val = arr.get(fp);
        fp++;
        return val;
    }
    
    public int peek() {
        return arr.get(fp);
    }
    
    // size = arr.size() - front;
    public boolean empty() {
		/*
		 * int checksize = arr.size()-fp; 
		 * if(checksize > 0) return false; else return
		 * true;
		 */
        return arr.size()==fp;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */