package a02Review.trycatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args)  {

        Scanner scan = new Scanner(System.in);
        System.out.println(" yasini yaz: ");
        int yasiniz = scan.nextInt();
        System.out.println(" boyunu yaz: ");
        int boyunuz = scan.nextInt();
        System.out.println("Average : " +  (yasiniz+boyunuz)/2);



        }
    }
