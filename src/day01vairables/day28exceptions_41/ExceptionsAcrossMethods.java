package day01vairables.day28exceptions_41;

public class ExceptionsAcrossMethods {

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) {

        return a / b;

        // Inner catch works first
//        catch (ArithmeticException e){
//            return 0;


    }

}