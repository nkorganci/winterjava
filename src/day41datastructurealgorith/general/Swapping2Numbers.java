package day41datastructurealgorith.general;

public class Swapping2Numbers {
    public static void main(String[] args) {

        swap1(2,3);
    }

    public static int swap1(int a, int b){


        // a temp b
        // a --> temp --> b --> a

        int temp = a;
        a = b;

        b=temp;

        System.out.println(a +" "+b);
        return a+b;

    }
}
