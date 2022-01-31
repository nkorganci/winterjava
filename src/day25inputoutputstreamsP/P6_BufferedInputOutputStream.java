package day25inputoutputstreamsP;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P6_BufferedInputOutputStream {
    // Java BufferedInputStream class is used to read information from stream.
    // It internally uses buffer mechanism to make the performance fast.
    // Especially for disk access and larger data amounts.
    public static void main(String[] args) {

        try {
            FileInputStream fileInput = new FileInputStream("src/day25inputoutputstreamsP/fileOutputStream.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
