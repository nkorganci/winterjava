package day01vairables.day25inputoutputstreamsP;

import java.io.*;
import java.nio.charset.Charset;

public class P8_InputStreamReader {
      //An InputStreamReader is a bridge from byte streams to character streams:
      // It reads bytes and decodes them into characters using a specified charset.
    // InputStreamReader reads all InputStreams, it reads all type of chars which is not english.
    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream("src/day25inputoutputstreamsP/fileInputStream.txt");
            InputStreamReader streamReader = new InputStreamReader(fileInput, Charset.forName("Big5"));
            int i = streamReader.read();
            while (i!=-1){
                System.out.print((char)i);
                i = streamReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
