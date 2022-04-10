package a02Review.trycatch;

import java.util.Scanner;

public class L03_ExceptionHandling {
}

class Exception{
    public static void main(String[] args) {
        int a = 2/0; // I did not print but I did calculation which is exception.
    }
}

class MyCalculator{
    public static void main(String[] args) {

    }

    public static int power(int n, int p) throws java.lang.Exception {

        if(n<0 || p<0){
            throw new java.lang.Exception("N can not be negative..");
        }else if(n==0 && p==0){
            throw new java.lang.Exception("Both of them can not be zero...");
        }else {
            return (int)Math.pow(n,p);
        }


    }
}

class Solution{
   static MyCalculator myCalculator = new MyCalculator();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in.hasNextInt()){
            int n = in.nextInt();
            int p = in.nextInt();

            try {
                System.out.println(myCalculator.power(n,p));
            }catch (java.lang.Exception e){
                System.out.println(e);
            }
        }
    }
}
