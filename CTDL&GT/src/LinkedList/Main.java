package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(3);
        linkedList.add(9);
        linkedList.add(1);
        linkedList.add(8);
        linkedList.forEach(i -> System.out.print(i+"\t"));
        System.out.println();

        linkedList.addFirst(0);
        linkedList.addLast(10);

        linkedList.forEach(i -> System.out.print(i+"\t"));
        System.out.println();

        linkedList.removeIf(i -> i%2==0);


        linkedList.forEach(i -> System.out.print(i+"\t"));
        System.out.println();
//          Lấy phần tử đầu tiên nhưng trả về Exception
        System.out.println("Phần tử đầu tiên : " + linkedList.getFirst());

        System.out.println("Phần tử cuối cùng : " + linkedList.getLast());
//        Lấy phần tử đầu tiên nhưng nếu rỗng trả về null
        System.out.println("Phân tử đầu tiên : " + linkedList.peek());
//        Lấy phần tử đầu tiên rồi xóa
        System.out.println("Phần tử đầu tiên : "+ linkedList.removeFirst());
        linkedList.forEach(i -> System.out.print(i+"\t"));

    }
}
