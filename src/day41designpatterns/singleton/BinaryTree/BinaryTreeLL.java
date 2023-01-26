package day41designpatterns.singleton.BinaryTree;

public class BinaryTreeLL {

    BinaryNode root;

    public BinaryTreeLL() {
        this.root = null;
    }

    //PreOrder Traversal
    void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + "->");
        preOrder(node.left);
        preOrder(node.right);
    }
}
