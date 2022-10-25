package LinkedList;

public class DemoLinkedList {

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);


        n1.next = n2;
        n2.next = n3;
        printNode(n1);
        printNode(n2);

        Node n0 = addAtHead(0,n1);
        printNode(n0);
        Node n4 = addAtTail(4,n0);
        printNode(n4);



    }

    public static void printNode(Node headNode){
        if(headNode == null){
            System.out.println("Linked List rỗng");
        }else {
            Node temp = headNode;
            while (temp!= null){
                System.out.print(temp.value);
                temp = temp.next;
                if(temp !=  null){
                    System.out.print("->");

                }else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addAtHead(int value,Node headNode){
        Node newNode = new Node(value);
        if(headNode !=null){
            newNode.next = headNode;
        }
        return newNode;
    }

    public static Node addAtTail(int value, Node headNode){
        Node newNode = new Node(value);
        if(headNode == null){
            return headNode;
        }else {
            //Xác định LastNode.next = NULL
            Node lastNode = headNode;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            //gán next cho lastNode = newNode
            lastNode.next = newNode;
        }

        return headNode;
    }

    public static  Node addAtIndex(int value, Node headNode, int index){
        //Kiểm tra vị trí index
        if(index == 0){
            return addAtHead(value,headNode);
        }else{
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count =0;
            while (curNode != null){
                count++;
                if(count == index){
                newNode.next = curNode.next;
                curNode.next = newNode;

                    break;
                }
                curNode= curNode.next;
            }
        }
        return headNode;
    }
}
