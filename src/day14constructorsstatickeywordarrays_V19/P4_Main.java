package day14constructorsstatickeywordarrays_V19;

public class P4_Main {
    public static void main(String[] args) {
        System.out.println("1. Program has started");
        P4_StaticCodeBlock obj1 = new P4_StaticCodeBlock("Hi");
        System.out.println("2. Program has started");
        P4_StaticCodeBlock obj2 = new P4_StaticCodeBlock("Bye");
        P4_StaticCodeBlock obj3 = new P4_StaticCodeBlock("World");
        System.out.println(P4_StaticCodeBlock.counter);//initial value was 3, 2 times called , sum is 5

    }
}
