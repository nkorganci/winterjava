package day01vairables.day25inputoutputstreamsP;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class P1_File {
    //input Stream==> read
    //output Stream==> write
    //There are Byte Streams and Character Streams
    //All byte streams are produced from  InputStream and OutputStream abstract classes.
    // All character stream is produced from READER and WRITER abstract classes
    public static void main(String[] args){

        /*
        File has four method
        1-createNew(),         2-delete(),         3-read(),         4-write()
         */

        // 1 Create a File
        File file = new File("src/day25inputoutputstreamsP/text01.txt");
        try {
           boolean isCreated= file.createNewFile();
           if(isCreated){
               System.out.println(file.getName()+" File Created");
           }else {
               System.out.println("Could not created");
           }

        } catch (Exception e) {
            e.printStackTrace();

        }

        //2 Delete a file

        File fileDelete = new File("src/day25inputoutputstreamsP/text01.txt");
        boolean isDeleted=fileDelete.delete();
        if(isDeleted){
            System.out.println("File is deleted");
        }

        //3 Create a directory

        File createDir = new File("src/day25inputoutputstreamsP/text01");//Create a folder
        createDir.mkdirs();

        //4 List of files
        File listFiles = new File("src/day25inputoutputstreamsP/text01");
        //4a print as array
        String [] filesArray= listFiles.list();
        System.out.println(Arrays.toString(filesArray));
        //4b Print as a string
        for (String str: filesArray){
            System.out.println(str);
        }

        // 5 Write to a File
        try {
            FileWriter  myWriter = new FileWriter("src/day25inputoutputstreamsP/text01.txt");
           myWriter.write("I wrote something on the text file");
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
