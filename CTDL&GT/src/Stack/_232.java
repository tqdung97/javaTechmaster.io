package Stack;

import java.util.Stack;

public class _232 {
    Stack<Integer> i = new Stack<>();
    Stack<Integer> j = new Stack<>();
    public void MyQueue() {
    }

    public void push(int x) {
        while ( ! i.isEmpty()){
            j.push(i.pop());

        }
        i.push(x);
        while(!j.isEmpty()){
            i.push(j.pop());
        }
    }

    public int pop() {
        if(i.isEmpty()){
            return -1;
        }
        return i.pop();
    }

    public int peek() {
        if(i.isEmpty()){
            return -1;
        }
        return i.peek();
    }

    public boolean empty() {
        return i.isEmpty();
    }
}

