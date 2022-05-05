package a02Review.collections1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sample {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("notExist.txt");
        FileInputStream stream = new FileInputStream(file);

        }
}
