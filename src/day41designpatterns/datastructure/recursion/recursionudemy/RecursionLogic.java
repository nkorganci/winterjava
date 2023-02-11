package day41designpatterns.datastructure.recursion.recursionudemy;

public class RecursionLogic {

    public static void main(String[] args) {

        one();

    }

    public static void one(){
        two();

        System.out.println("1st method");
    }
    public static void two(){
        three();
        System.out.println("2st method");
    }
    public static void three(){
        four();
        System.out.println("3st method");
    }

    public static void four(){
        System.out.println("4st method");
    }


}
