package day25inputoutputstreamsP;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class P2_FileInputStream {
    // InputStream use binary(byte) stream, abstract class
    // InputStream sub classes : FileInputStream, ByteArrayInputStream, ObjectInputStream
    //  FileInputStream sınıfı, dosyalardan verileri (bayt cinsinden) okumak için kullanılır.
    //A FileInputStream obtains input bytes from a file in a file system.
    public static void main(String[] args) {

                // 1  I called FileInputStream class to read file
        try {
//            File inputFile = new File("src/day25inputoutputstreamsP/fileInputStream.txt");// File can be selected if there is
//            inputFile.createNewFile(); // if there is no this file create
            FileInputStream input = new FileInputStream("src/day25inputoutputstreamsP/fileInputStream.txt");
//            System.out.println(input.read());// 1A - Read return byte value as integer, 73, 32
//            System.out.println(input.read());// Read return byte value as integer
                // 1B- Number of chars left in string
            System.out.println("How many characters are there " + input.available());
                // 1C- Skips 3 chars then write
            System.out.println("How many chars are you going to skip: " + input.skip(3));
                int i = input.read();
            while (i!=-1){
                char ch = (char)i;
                System.out.print(ch);
                i=input.read();
            }
            input.close();// if you dont close it works , occupy spae
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
