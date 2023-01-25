package day41designpatterns.singleton.BinaryTree;

public class Main {

    public static void main(String[] args) {
        TreeNode drinks = new TreeNode("Drinks");
        TreeNode hot = new TreeNode("hot");
        TreeNode cold = new TreeNode("cold");
        TreeNode tea = new TreeNode("tea");
        TreeNode coffee = new TreeNode("coffee");
        TreeNode water = new TreeNode("water");
        TreeNode coke = new TreeNode("coke");

        drinks.addChild(hot);
        drinks.addChild(cold);
        hot.addChild(tea);
        hot.addChild(coffee);
        cold.addChild(water);
        cold.addChild(coke);

        System.out.println(drinks.print(0));
    }


}
