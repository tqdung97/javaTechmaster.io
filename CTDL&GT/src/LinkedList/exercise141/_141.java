package LinkedList.exercise141;

public class _141 {
    public static boolean hasCycle(ListNode head) {

        if (head == null || head.next == null)
            return false;

        ListNode slowPointer = head;
        ListNode fastPointer = head.next;

        while(fastPointer != null && fastPointer.next != null){
            if(fastPointer == slowPointer)
                return true;
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3,2,0,-4);
//        ListNode head2= new ListNode(2);

        System.out.println(hasCycle(head));
    }


}
