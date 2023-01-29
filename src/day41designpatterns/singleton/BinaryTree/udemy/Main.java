package day41designpatterns.singleton.BinaryTree.udemy;

import java.util.LinkedList;
import java.util.Queue;

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

    //InOrder Traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }

    // Search Method
    public void search(String value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
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
//        binaryTree.preOrder(binaryTree.root);
        System.out.println();
        binaryTree.inOrder(binaryTree.root);

    }

}

class BinaryNode {

    public int data;
    public BinaryNode left, right;
    public int height;
}
