package stack.day1;

// 1381. Design a Stack With Increment Operation -  https://leetcode.com/problems/design-a-stack-with-increment-operation/

public class StackWithIncOp {
	
}

class CustomStack {
    int[] arr;
    int len, i;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        this.len = maxSize;
        this.i =0;
    }
    
    public void push(int x) {
        if(this.i < len){
            arr[this.i] = x;
            this.i = this.i + 1;
        }
    }
    
    public int pop() {
        int x = -1;
        if(this.i > 0){
            this.i--;
            x = arr[this.i];
        }
        return x;
    }
    
    public void increment(int k, int val) {
        if(k < i){
            for(int be=0; be<k; be++){
                arr[be] = arr[be] + val;
            }
        }

        else{
            for(int be=0; be<i; be++){
                arr[be] = arr[be] + val;
            }
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */