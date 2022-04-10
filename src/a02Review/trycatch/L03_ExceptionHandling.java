package a02Review.trycatch;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class L03_ExceptionHandling {
}

class Exception{
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        try{
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(a/b);
        }catch (ArithmeticException e){

                System.out.println("hmm");
            }catch (MissingFormatArgumentException e){

        }
            }


}

