package day01vairables.day25inputoutputstreamsP;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class P3_FileOutputStream {
    public static void main(String[] args) {

        String userInput = "I will add this \ntext";

        // 1- FileInputStream creates new file if there is no
        // Need to write TRUE as parameter if you would like to add new text, otherwise write from the beginning
        try {
            //
            FileOutputStream fileOutput= new FileOutputStream("src/day25inputoutputstreamsP/fileOutputStream.txt");// erase all and write
            //FileOutputStream fileOutput1= new FileOutputStream("src/day25inputoutputstreamsP/fileOutputStream.txt", true);// append the new text
            byte[] inputByte= userInput.getBytes();
            System.out.println(Arrays.toString(inputByte));// writes byte valus. [73, 32, 119...
            fileOutput.write(inputByte);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
