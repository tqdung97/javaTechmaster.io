package Stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(6);
        stack.push(9);
        stack.push(7);
        int size = stack.size();
        System.out.println(size);
        for(int i=0; i< stack.size(); i++){
            System.out.println(stack.pop() + "\t");
        }


        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search(2));



    }
}
