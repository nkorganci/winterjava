package day41designpatterns.datastructure.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(70);
        binarySearchTree.insert(50);
        binarySearchTree.insert(90);
        binarySearchTree.insert(30);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.insert(100);

    }
}

class BinaryNode {
    public int value;
    public int height;
    public BinaryNode left;
    public BinaryNode right;

}

class BinarySearchTree {

    BinaryNode root;

    BinarySearchTree() {
        root = null;
    }

    //Insert method
    private BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode newNode = new BinaryNode();
            newNode.value = value;
            System.out.println("Value inserted: ");
            return newNode;
        } else if (value <= currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
            return currentNode;
        } else {
            currentNode.right = insert(currentNode.right, value);
                return currentNode;
            }
        }



    void insert(int value) {
        insert(root, value);
    }
}
