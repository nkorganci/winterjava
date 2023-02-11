package day01vairables.day25overridingexceptions_36;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class L09_FileInputStream {
    /*
    FileNotFoundException is a CTE
     */
    public static void main(String[] args) {

       // FileInputStream fis = new FileInputStream("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day25overridingexceptions_36\\filefor");//FileInputStream constructor must have parameter

        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day25overridingexceptions_36\\filefor");//FileInputStream constructor must have parameter
            System.out.println("If ound the file");
        }catch (FileNotFoundException e){
            System.out.println("Path or file is missing");
        }
    }
}

class a{
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    private static void run(){
        throw new RuntimeException("Run more");
    }
}




