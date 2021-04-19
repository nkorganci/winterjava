package Q130;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        try{
            Path path = Paths.get("/u01/work/filestore.txt");
            boolean result= Files.deleteIfExists(path);
            if (result) System.out.println(path + "is deleted.");
            else System.out.println(path + " is not deleted.");
        }catch (IOException e){
            System.out.println("Exception");
        }
    }
}

/*
Assume the file on path does not exist. What is the result?
A. The compilation fails.
B. /u01/work/filestore.txt is not deleted.
C. Exception
D. /u01/work/filestore.txt is deleted.
Answer: A
 */