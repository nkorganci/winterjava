package day01vairables.day28exceptions_41;

public class TryCatch {
    public static void main(String[] args) {
        int a = 2;
        int b =0;
        try {
            int c = a/b;
        }catch (ArithmeticException e){
            System.out.println("Error: "+ e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally worked");
        }
    }
}
