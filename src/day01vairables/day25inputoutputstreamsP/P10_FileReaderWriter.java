package day01vairables.day25inputoutputstreamsP;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P10_FileReaderWriter {
        //FileReader makes it possible to read the contents of a file as a stream of characters.
    // It works much like the FileInputStream except the FileInputStream reads bytes, whereas the FileReader reads characters.
    public static void main(String[] args) {

        try {
            FileReader fReader = new FileReader("src/day25inputoutputstreamsP/text01.txt");
            int i = fReader.read();
            while (i!=-1){
                System.out.print((char)i);
                i=fReader.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

class fileWriter{
    public static void main(String[] args) {
        String data = "Hellow World";
        try {
            FileWriter  fWriter = new FileWriter("src/day25inputoutputstreamsP/fileWriter.txt");
            fWriter.write(data);
//            fWriter.flush();
            fWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
