package queue_deque.day1;

import java.util.LinkedList;

public class P3DequeUsingLL {

}

class MyQueue2 {
    LinkedList<Integer> ll;
    public MyQueue2() {
        ll = new LinkedList<>();
    }
    
    public void push_back(int x) {
        ll.addLast(x);
    }

    public void push_front(int x) {
        ll.addFirst(x);
    }
    
    public int pop_back() {
        return ll.	pollLast();
    }

    public int pop_front() {
        return ll.pollFirst();
    }

    public int peek_back() {
        return ll.getLast();
    }
    
    public int peek_front() {
        return ll.getFirst();
    }
    
    public boolean empty() {
        return ll.size() == 0;
    }
}

