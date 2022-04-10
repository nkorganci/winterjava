package a02Review.trycatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class L09_Throw {
}

class T{
    static int divide(int m, int n) throws ArithmeticException{ // When you call a method , you just need to remind.
        int div =m/n;
        return div;
    }

    public static void main(String[] args) {
        T obj = new T();

        try{
            System.out.println(divide(3,0));
        }catch (ArithmeticException e){
            System.out.println("no zero");
        }
        System.out.println("Rest of the code");
    }
}

// U
class U{
    static void method() throws ArithmeticException{
        System.out.println("inside the method...");
        throw new ArithmeticException("Arithmetic...");
    }
    public static void main(String[] args) {
        try{
            method();
        }catch (ArithmeticException e){
            System.out.println("in main");
        }
    }
}