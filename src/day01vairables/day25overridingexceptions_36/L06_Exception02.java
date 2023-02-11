package day01vairables.day25overridingexceptions_36;

import java.io.FileInputStream;// io means in put and output
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class L06_Exception02 {

    public static void main(String[] args) {
//        exception01();
//	exception02();
//	exception03();
//	exceptionHandling();
//	resolveInCatchBlock();

    }

    public static void exception01() {

        // FileInputStream fis = new FileInputStream("/winterjava/src/day25overridingexceptions_36/fileForExc");
        // Unhandled exception type FileNotFoundException

        FileInputStream fis = null;// Object is not created in try body, we can nout use it outside of the body. Outside of the scope.

        try {

            fis = new FileInputStream(
                    "C:\\Users\\nuri.korganci\\eclipse-workspace\\winterjava\\src\\day25overridingexceptions_36\\fileForExc");
            System.out.println("Try body worked");// If this message appear try body worked
            // I need to get full path, from properties get the address.

        } catch (FileNotFoundException e) {

            System.out.println("File is deleted or path is wrong");
        }

    }

    public static void exception02() {

        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[5]);// 5 is index number
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {// This is optional
            System.out.println("The 'try catch' is finished.");
        }
    }

    public static void exception03() {

        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Number can not be divided by 0");
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }

    public static void exceptionHandling() {

        try { // If the exception is in the try block, rest of the block will not work.
            int a = 3 / 0;

        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("You have an error");
        }
        System.out.println("The rest of the code is executed");

    }

    public static void resolveInCatchBlock() {

        int a = 6;
        int b = 0;

        int data;

        try {
            data = a / b;
            System.out.println("try");// Did not work because I could not solve the exception
        } catch (Exception e) {
            System.out.println("Correct answer is: " + a / (b + 2));
        }

    }

    public static void TryCatchExample7() {
        try {
            int data1 = 50 / 0; // may throw exception

        }
        // handling the exception
        catch (Exception e) {
            // generating the exception in catch block
            int data2 = 50 / 0; // may throw exception

        }
        System.out.println("rest of the code");
    }

    public static void arithmeticException(){


        System.out.println(100/0);
    }

    public static void checkedException(){

    }
}
