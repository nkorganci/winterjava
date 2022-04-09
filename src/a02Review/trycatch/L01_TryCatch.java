package a02Review.trycatch;

public class L01_TryCatch {
}

class TryCatch{
    public static void main(String[] args) {


       try{
           int data = 100/0; // Artihmetic Exception

       }catch (ArithmeticException e){
           System.out.println(e);
           System.out.println(e.getMessage());
           System.out.println("dont dive by zero");
       }
        System.out.println("System is running");
    }
}

class TryCatch1{
    public static void main(String[] args) {

        try{
            String str = null;
            String str1 = "";
            System.out.println(str.length());
            System.out.println("inside try ");
        }finally {
            System.out.println("finally block ");
        }

        System.out.println("rest");


    }
}

class Switch{
    public static void main(String[] args) {


    }
}


