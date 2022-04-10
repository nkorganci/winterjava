package a02Review.trycatch;

public class L04_Throw {
}

class Throw extends Exception{


    static void divide(int a, int b) throws java.lang.Exception {

        System.out.println("Before method...");
        if(b<0){
            System.out.println(a/b);
            throw new java.lang.Exception("b can not be zero.");
        }
        System.out.println("After method...");

    }

    public static void main(String[] args) {

        try{
            divide(2,0);
        }catch (java.lang.Exception e){
            System.out.println(e);
            System.out.println("hi");
        }

    }
}
