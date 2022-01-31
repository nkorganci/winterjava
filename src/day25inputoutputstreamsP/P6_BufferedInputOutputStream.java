package day25inputoutputstreamsP;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P6_BufferedInputOutputStream {
    // Java BufferedInputStream class is used to read information from stream.
    // It internally uses buffer mechanism to make the performance fast.
    // Especially for disk access and larger data amounts.
    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream("src/day25inputoutputstreamsP/buffered.txt");
            BufferedInputStream bufferInput = new BufferedInputStream(fileInput);
            int i = bufferInput.read();
            while (i!=-1){
                System.out.print((char)i);
                i=bufferInput.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
