package a01codingpractice;

import java.util.Scanner;

public class Solution {

    //Write your code here
    static Scanner scan = new Scanner(System.in);
    public static int B=scan.nextInt();
    public static int H=scan.nextInt();
    public static boolean flag=true;

    static {
        try{
            if(B<=0 || H<=0){
                flag=false;
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            }else {
                flag=true;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());

        }

    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class

