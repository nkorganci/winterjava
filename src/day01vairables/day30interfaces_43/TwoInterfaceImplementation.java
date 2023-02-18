package day01vairables.day30interfaces_43;

public class TwoInterfaceImplementation implements A,B {
    public void run(){
        System.out.println("HI");
    }

    @Override
    public void fly() {
        A.super.fly();
    }

    public static void main(String[] args) {

    }
}
interface A{
    void run();
    default void fly(){
        System.out.println("fly a");
    }
}
interface B{
    void run();
    default void fly(){
        System.out.println("fly a");
    }
}
