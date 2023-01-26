package day41designpatterns.singleton.BinaryTree.treeashok;

public class BinaryTree1 {

    public void preOrder(){

        preOrder();
    }

    private void preOrder(Node4 p){
        if(p==null){
            return;
        }

        System.out.println(p.root + " ");
        preOrder();
    }

}
