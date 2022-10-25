package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        for(int i =0; i< 5; i ++){
            queue.add(i);
        }
        System.out.println(queue);
        System.out.println("Phần tử đầu tiên: " + queue.peek());
        System.out.println(queue.offer(6));
        System.out.println(queue);
    }
}
