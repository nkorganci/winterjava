package day29abstractclass_V42.Socrative;

public class P01_PringGetMessage {

    /*
    1- e.getMessage();==>  it just get the message
    2- System.out.println(e.getMessage());==> print the message
    3- e.printStackTrace(); ==> prints the error.
     */

    public static void main(String[] args) {
        A();

    }

    public static void A(){

        try {
            int a= 2/0;
            System.out.println(a);
        }catch (Exception e){
//            e.getMessage();
            //e.printStackTrace();
            System.out.println(e);
//            System.out.println(e.getMessage());
           // System.out.println("can not be divided");
        }
    }
}
