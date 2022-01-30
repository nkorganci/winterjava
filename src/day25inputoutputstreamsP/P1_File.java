package day25inputoutputstreamsP;

import java.io.File;
import java.io.IOException;

public class P1_File {
    //input Stream==> read
    //output Stream==> write
    //There are Byte Streams and Character Streams
    //All byte streams are produced from  InputStream and OutputStream abstract classes.
    // All character stream is produced from READER and WRITER abstract classes
    public static void main(String[] args) {

        /*
        File has four method
        1-createNew()
        2-delete()
        3-read()
        4-write()
         */

        //1 CREATE FILE
        File file = new File("src/day25inputoutputstreamsP/file.txt");
        try{
            boolean value=file.createNewFile();
            if(value){
                System.out.println("New file is created");
            }else {
                System.out.println("New file could not be created");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //2 DELETE FILE
//        file.delete();
//        System.out.println(file.delete());// Will return true

        //3 Make directory mkdir

//        boolean mkdir = file.mkdir("src/day25inputoutputstreamsP/files");
//        System.out.println(mkdir);

        // 4 LIST OF ITEMS IN FILE
        File file1 = new File("src/day25inputoutputstreamsP/file1.txt");
        try {
           boolean f= file1.createNewFile();
           if(f){
               System.out.println(file1.getName()+ " Created");
           }else {
               System.out.println(file1.getName()+ " Not created");
           }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5 list() of files
        File file2 = new File("src/day25inputoutputstreamsP/file2.txt");
        try {
            file2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
