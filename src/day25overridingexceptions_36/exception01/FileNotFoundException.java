package day25overridingexceptions_36.exception01;

import java.io.FileInputStream;

public class FileNotFoundException {
    /*
    QUESTION
    1-I entered correct path, why it gives error again.
     */
    /*
    1- FileNotFoundException is a class , imported from a package
    2- This is a Compile time error. If there is issue in file or path.
     */

    public static void main(String[] args) {

        FileInputStream fis = null;// I should use in here , not in try body, otherwise I can not use it anywhere else.

        try {
            fis = new FileInputStream("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day25overridingexceptions_36\\exception\\javaFile");

        } catch (java.io.FileNotFoundException e) {
            System.out.println("File is deleted or path is wrong ");

        }
    }
}



