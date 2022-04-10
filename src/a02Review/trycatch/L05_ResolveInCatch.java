package a02Review.trycatch;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class L05_ResolveInCatch {
}

class Resolve{
    public static void main(String[] args) {

    try{
        int data =5/0;
    }catch (ArithmeticException e){ // If you write wrong expection it will stop there
        System.out.println(e);
    }
        System.out.println("rest");
    }
}

class CheckedException{
    public static void main(String[] args) {
        PrintWriter a;
        try{
            a = new PrintWriter("hi.txt");
            System.out.println("hi");
        }catch (FileNotFoundException e){
            System.out.println(e);
            System.out.println("bye");
        }
        System.out.println("File saved");
    }
}
