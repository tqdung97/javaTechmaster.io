package Stack;

import java.util.Stack;

public class _70 {
    public static int climbStairs(int n) {

        if (n < 3){
            return n;
        }
        Stack<Integer> step = new Stack<>();
        step.push(1);
        int count = 2;
        while (n > 2){
            count = step.peek() + step.push(count);
            n--;
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }
}
