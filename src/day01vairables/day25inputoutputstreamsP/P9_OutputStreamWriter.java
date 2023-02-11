package day01vairables.day25inputoutputstreamsP;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class P9_OutputStreamWriter {
    public static void main(String[] args) {

        String output = "Hello adfsdf";
        try {
            File f = new File("src\\day25inputoutputstreamsP\\text03.txt");
            f.createNewFile();
            FileOutputStream fileInput = new FileOutputStream(f);
            OutputStreamWriter outputWriter = new OutputStreamWriter(fileInput);
            outputWriter.write(output);
            System.out.println(outputWriter.getEncoding());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

