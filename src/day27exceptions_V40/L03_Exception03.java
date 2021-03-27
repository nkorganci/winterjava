package day27exceptions_V40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class L03_Exception03 {
    /*
    1-"throws" keyword is used for  "checked exceptions"
    2-"throws" keyword is used when we do not want to handle exception
    3-After "throws" keyword, you can use multiple Exception classes by putting comma between them
    4- "throws" keyword can not be used in method body. It must be used inmethod name line.
    5- IO Exception is the parent exception, so when you remove FileNotFoundException it will not complain.
    if you use parent and child Exception classes together, it works but not recommended. Because
    parent will cover both of them. Order does not effect.
     */
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        //It complain because there is no handling exception.
        FileInputStream fis = new FileInputStream("/Users/apple/Downloads/eclipse-workspace/winterjava/src/dayoverridingexceptions/fileForExc.txt");

        int k = 0;

        while((k = fis.read()) != -1) {

            System.out.print((char)k);

        }

    }
}
