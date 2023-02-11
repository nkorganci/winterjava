package day01vairables.day28exceptions_41;

public class L01_ExceptionsFinalBlock {
    /*
    1-"finally" is used with "try catch"
    2-"finally block" is executed under any condition
    3-"finally" can be used without catch block
    4-try block can not be used alone
    5-try + catch +(catch...) + finally
    6-try+finally ==> it means you dont want to handle exception and end with ending connection.
     */
    public static void main(String[] args) {
        div();

    }
    public static void div(){
        try{
            int a = 2/0;
        }
//        catch (ArithmeticException e){
//            System.out.println("Do not use zero for the denominator");
//        }
        finally {
            System.out.println("Do you want to do more operations");
        }
    }
}
