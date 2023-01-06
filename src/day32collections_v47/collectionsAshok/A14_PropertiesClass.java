package day32collections_v47.collectionsAshok;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class A14_PropertiesClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/day32collections_v47/collectionsAshok/database.properties");
        Properties p = new Properties();
        p.load(fis);
        String uname=p.getProperty("uname");
        System.out.println(uname);

        System.out.println("p class: " +p); // {hi=2, uname="Nuri"}

        fis.close();
    }
}
