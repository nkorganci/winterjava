package day41designpatterns.datastructure.BinaryTree.treeashok;

public class BinaryTree1 {

    public void preOrder(){

        preOrder();
    }

    private void preOrder(Node1 p){
        if(p==null){
            return;
        }

        System.out.println(p.root + " ");
        preOrder();
    }

}
