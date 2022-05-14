package a02Review.trycatch;

public class Example {

    public static void main(String[] args) {
        int a = 2;
        for (int i = 0; i < 10; i+=a) {
            System.out.print(i -a + " ");
            a++;
        }
    }
}