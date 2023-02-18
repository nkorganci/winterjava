package day41designpatterns.datastructure.binarytree;

import java.util.LinkedList;
import java.util.List;

public class preorderTraversalRecursive {

}

class TreeNodeRecursive{
    int val;
    TreeNodeRecursive left;
    TreeNodeRecursive right;

    public TreeNodeRecursive() {
    }

    public TreeNodeRecursive(int val, TreeNodeRecursive left, TreeNodeRecursive right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class SolutionRecursive{
    List<Integer> res = new LinkedList<>();
    public List<Integer> preorderTraversal(TreeNodeRecursive root){
        helper(root);
        return res;
    }

    private void helper(TreeNodeRecursive root){
        if(root==null){
            return;
        }
        res.add(root.val);
        helper(root.left);
        helper(root.right);
    }
}
