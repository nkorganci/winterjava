package day40CodeUsingJava;
/*
Explanation -
Main method can be overloaded. But the JVM always calls the main method with string arguments
 */

public class MainMethodOverloading {
}

class Test00 {
    public static void main(String [] main1) {
        System.out.println("main1");
    }

    public static void main(Integer [] main2) {
        System.out.println("main2");
    }

    public static void main(byte [] main3) {// I thought byte gave error but no.
        System.out.println("main3");
    }
}
