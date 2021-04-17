package day40CodeUsingJava;

public class Q009 {


}

class First {
    public static void main(String[] args) {
        System.out.println("This is " + args[0] + "!");
    }
}

class Second {
    public static void main(String[] args) {
        First.main(args);
    }
}