package day26exceptions_37.exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions01 {
    /*
    QUESTION: Why do we use child then parent, parent already cover all?
    1- There are 2 main exceptions
    a)Runtime error(unchecked exceptions), b) Compile time error (checked exceptions)
    2-Nested try-catch is not recommended
    3-Try block can not be used alone.
    4-There can be multiple try-catch blocks.
    5-For multi catch block, There should be child parent order in exceptions,
    because we need specific error, parent gave general mistake.
     */

    /*
    What is the meaning of "Platform independent"?
    1- System.out.println("Hi");-->High level code--> JVM-->java Byte Code--> win, mac...
    2- Java is platform independent ( byte code) can run on all operating systems, but JVM is platform dependent.
     */

    public static void main(String[] args) {

        FileInputStream file = null;

        try {
            file = new FileInputStream("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day26exceptions_37\\exceptions02\\sample01");
            int k = 0;
            try {
                while ((k = file.read()) != -1) { //Read method get the first char of file, return ascii value
                    System.out.print((char) k);
                }
            } catch (IOException e) {
                System.out.println("File could not be read");

            }
        } catch (FileNotFoundException e) {
            System.out.println("File is deleted or path is wrong");

        }
    }//Nested try-catch block
}

    class Exceptions02 {
    public static void main(String[] args) {
        FileInputStream file = null;

        try {
            file = new FileInputStream("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day26exceptions_37\\exceptions02\\sample01");
            int k = 0;

            while ((k = file.read()) != -1) { //Read method get the first char of file, return ascii value
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {//Child
            System.out.println("File is deleted or path is wrong");//User defined message
            System.out.println(e.getMessage()); // Java defined message
           // System.out.println("File is deleted or path is wrong " +e.getMessage() );// Good Practice
            e.printStackTrace();//Detailed error message

        } catch (IOException e) {//Parent
            System.out.println("File can not be read");
        }
    }

}// Without nested loop, multi catch block
