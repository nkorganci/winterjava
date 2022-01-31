package day25inputoutputstreamsP;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class P7_PrintStream {
    //A PrintStream (similiar to outputstream) adds functionality to another output stream,
    // namely the ability to print representations of various data values conveniently. ...
    // Unlike other output streams, a PrintStream never throws an IOException ;
    // used to write output data in commonly readable form (text) instead of bytes. It extends the abstract class OutputStream .
    public static void main(String[] args) {
        File printStreamFile = new File("src/day25inputoutputstreamsP/printStream.txt");
        try {
            printStreamFile.createNewFile();
            PrintStream output = new PrintStream(printStreamFile);
            output.println(234);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
