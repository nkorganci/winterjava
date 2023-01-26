package day41designpatterns.singleton.BinaryTree.udemy;

public class Main {
    public static void main(String[] args) {

    }
}

class BinaryTreeLL {

    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    //PreOrder Traversal
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + "->");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        BinaryNode n1 = new BinaryNode();
        n1.data = 1;
        BinaryNode n2 = new BinaryNode();
        n2.data = 2;
        BinaryNode n3 = new BinaryNode();
        n3.data = 3;


        n1.left = n2;
        n1.right = n3;

        BinaryTreeLL binaryTree = new BinaryTreeLL();
        binaryTree.root = n1;
        binaryTree.preOrder(binaryTree.root);

    }

}

class BinaryNode {

    public int data;
    public BinaryNode left, right;
    public int height;
}
