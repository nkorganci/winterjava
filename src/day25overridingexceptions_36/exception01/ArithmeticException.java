package day25overridingexceptions_36.exception01;

public class ArithmeticException {
    public static void main(String[] args) {

       System.out.println(arithmetic(20,3));
//        System.out.println(arithmetic(20, 0));

    }

    public static int arithmetic(int a, int b) {
        int result = 0;

        try {
            result = a/b;
        } catch (java.lang.ArithmeticException e) {
            System.out.println("You can not divide by 0");
            System.out.println(e);
        }
        return result;

    }
}
