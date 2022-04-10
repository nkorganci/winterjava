package a02Review.trycatch;

public class L08_Finally {
    public static void main(String[] args) {
        try{
            System.out.println(2/0);
        }catch (IndexOutOfBoundsException e){
            System.out.println("in catch");
        }finally {
            System.out.println("in finally");
        }
        System.out.println("rest of the code");
    }
}


class TestFinallyBlock2{
    public static void main(String args[]){

        try {

            System.out.println("Inside try block");

            //below code throws divide by zero exception
            int data=25/0;
            System.out.println(data);
        }

        //handles the Arithmetic Exception / Divide by zero exception
        catch(ArithmeticException e){
            System.out.println("Exception handled");
            System.out.println(e);
        }

        //executes regardless of exception occured or not
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code...");
    }
}