package day01vairables.day36lambda;

public class L10_FunctionalInterface {
    public static void main(String[] args) {

        A obj = () -> System.out.println("hi"); // You are telling what to do
        obj.run();

    }
}

@FunctionalInterface
interface A {
    void run();
}
