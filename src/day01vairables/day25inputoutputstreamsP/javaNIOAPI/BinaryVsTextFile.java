package day01vairables.day25inputoutputstreamsP.javaNIOAPI;

import day01vairables.day28exceptions_41.TryCatch;

import java.io.*;

public class BinaryVsTextFile {
    public static void main(String[] args) {
        //Writing to a binary file
//        try (OutputStream out = new BufferedOutputStream(new FileOutputStream("example.bin"))) {
//            out.write(new byte[]{0x48, 0x65});
//        }

        //Reading from a text line
        try(BufferedReader in = new BufferedReader(new FileReader("example.txt"))){
            String line = in.readLine(); //Reading one line from the file
            System.out.println(line);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
