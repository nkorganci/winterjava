package day01vairables.day25inputoutputstreamsP;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class P12_PrintWriter {
    // Prints formatted representations of objects to a text-output stream.
    public static void main(String[] args) {
        try {
            PrintWriter printWriter= new PrintWriter("src/day25inputoutputstreamsP/text02.txt");
            printWriter.print("Hello" + 234);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
