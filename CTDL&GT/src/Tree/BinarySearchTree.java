package Tree;

public class BinarySearchTree {


//    Thêm Node

    public  Node insert(Node root, int value){
        Node newNode = new Node(value);

        if(root == null){
            return newNode;

        }else{
            Node temp = root;
            while (true){
                if(value < temp.value){
                    if(temp.left == null){
                        temp.left = newNode;
                        break;
                    }else {
                        temp = temp.left;
                    }
                }else {
                    if(temp.right == null){
                        temp.right = newNode;
                        break;
                    }else {
                        temp = temp.right;
                    }
                }
            }
        }
        return root;
    }

    public Node remove(Node root, int key){
        if(root == null){
            return null;
        }

        //B1: Tìm node cần xóa

        if(key < root.value){ // đi về phía bên trái
            root.left = remove(root.left,key);

        }else if(key > root.value){ // đi về phía bên phải
            root.right = remove(root.right,key);
        }else { // Xác định node cần xóa
            //TH1:  Node cần xóa là node lá
            if(root.left == null && root.right == null) return null;

            //TH2: Node cần xóa có 1 node con
            //Node cần xóa có 1 nốt con nằm ở bên trái
            if(root.left != null && root.right == null) return root.left;
            //Node cần xóa có 1 nốt con nằm ở bên phai
            if(root.left == null && root.right != null) return root.right;
        }
            //TH3 : Node cân cóa có 2 nốt con
        Node leftNode = findLeftNode(root.right);
        root.value= leftNode.value;
        root.right=remove(root.right,leftNode.value);



        return root;
}
    private Node findLeftNode (Node root ){
        if (root==null){
            return null;
        }
        Node findNode = root;
        while (findNode.left!=null){
            findNode = findNode.left;

        }
        return findNode;
    }

    public   void preOrder (Node root){
        if (root==null){
            return;
        }

        System.out.print(root.value+"\t");

        preOrder(root.left);//duyệt bên trai

        preOrder(root.right);//duyệt bên phải

    }


    public void inOrder(Node root){
        if(root == null){
            return;
        }
        //Duyệt bên trái
        inOrder(root.left);
        //Duyệt gốc
        System.out.print(root.value + "\t");
        // Duyệt bên phải
        inOrder(root.right);
    }
    public  void postOrder(Node root){
        if(root == null){
            return;
        }
        // Duyệt bên trái
        postOrder(root.left);
        // Duyệt bên phải
        postOrder(root.right);
        // Duyệt gốc
        System.out.print(root.value + "\t");

    }
}
