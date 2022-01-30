//package day25inputoutputstreamsP;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class P2_FileReaderFileWriter {
//    public static void main(String[] args) {
//
//        // 1 File created
//        File file3 = new File("src/day25inputoutputstreamsP/file3.txt");
//        try {
//            file3.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // 2 FileReader
//        try {
//            FileReader fileR = new FileReader("src/day25inputoutputstreamsP/file3.txt");
//            int i = fileR.read();
//            while (i!=-1){
//                System.out.println(char(i));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//}
