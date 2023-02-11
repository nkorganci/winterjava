package day01vairables.day25inputoutputstreamsP;

import java.io.*;
import java.nio.charset.Charset;

public class P11_BufferedReaderWriter {
    //Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of
    // characters, arrays, and lines. The buffer size may be specified,
    // or the default size may be used. The default is large enough for most purposes.
    //Java BufferedReader class is used to read the text from a character-based input stream.
    // It can be used to read data line by line by readLine() method. It makes the performance fast.
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("src/day25inputoutputstreamsP/text01.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line!=null){
                System.out.println(line);
                line=bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class BufferedWriter1{
    public static void main(String[] args) {
        try {
            FileWriter fileWriter= new FileWriter("src/day25inputoutputstreamsP/text02.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);// You can add charset
            bufferedWriter.write("buffered Writer");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
