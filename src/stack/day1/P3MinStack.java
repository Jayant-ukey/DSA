package stack.day1;

import java.util.Stack;

public class P3MinStack {

}

//155. Min Stack-  https://leetcode.com/problems/min-stack/description/
class MinStack {
    Stack<Integer> so;
    Stack<Integer> sm;
    int min;

    public MinStack() {
        so = new Stack<>();
        sm = new Stack<>();
    }
    
    public void push(int val) {
        so.push(val);
        
        if(sm.size() == 0)
            sm.push(val);

        else
            sm.push(Math.min(val, sm.peek()));  
    }
    
    public void pop() {
        so.pop();
        sm.pop();
    }
    
    public int top() {
       return so.peek();
    }
    
    public int getMin() {
        return sm.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */