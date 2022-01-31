package a01codingpractice;

import java.util.Stack;

public class BalancedBrackets {
    /*
        Input: exp = “[()]{}{[()()]()}”
        Output: Balanced

        Input: exp = “[(])”
        Output: Not Balanced
     */
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();

        String str = "(({[]}))";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                stack.push(str.charAt(i));

            }
            }
        System.out.println("left: " + stack);


    }

    public static boolean balancedBracket1(String str){

        Stack<Character> stack = new Stack<Character>();

        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                stack.push(str.charAt(i));
                System.out.println(stack);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
            }
        }
        return false;

    }
}
