package a02Review.trycatch;

import day28exceptions_41.GarbageCollector;

public class L02_HandlingException {
    public static void main(String[] args) {

try {
    System.out.println(2/0);}
catch (ArithmeticException e){
}
finally {
    System.out.println("Hello");
}
        System.out.println("after final...");
            }
    }

