package Tree;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {
        Node n9 = new Node(9);
        Node n4 = new Node(4);
        Node n3 = new Node(3);
        Node n2 = new Node(2);
        Node n1= new Node(1);
        Node n8= new Node(8);
        Node n7 = new Node(7);
        Node n5 = new Node(5);
        Node n10 = new Node(10);
        Node n11 = new Node(11);
        Node n12 = new Node(12);
        Node n13 = new Node(13);
        Node n14 = new Node(14);
        Node n15 = new Node(15);
        Node n18 = new Node(18);
        Node n19 = new Node(19);
        Node n20 = new Node(20);
        Node n21 = new Node(21);
        Node n24 = new Node(24);
        Node n27 = new Node(27);

       n9.left = n4; n9.right = n15;
       n4.left = n3; n4.right =n7;
       n3.left = n2;
       n2.left = n1;
       n7.left = n5; n7. right = n8;
       n15.left = n11; n15.right = n20;
       n11.left = n10; n11.right =n13;
       n13.left = n12; n13.right = n14;
       n20.left = n18; n20.right = n24;
       n18.right = n19;
       n24.left = n21; n24.right = n27;
        System.out.println();



        BinarySearchTree binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(n9,2);
        System.out.println();
        binarySearchTree.preOrder(n9);
        System.out.println();
        binarySearchTree.inOrder(n9);
        System.out.println();
        binarySearchTree.postOrder(n9);

    }

}
