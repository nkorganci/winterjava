package day01vairables.day28exceptions_41;

public class ThrowException {
    public static void main(String[] args) {

        try {
            int result = divide(2,0);
            System.out.println("Result "+ result);
        }catch (ArithmeticException e){
            System.out.println("Message in main method " + e.getMessage());
        }

    }

    public static int divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Can not be divided by 0");
        }
        return a/b;
    }
}
