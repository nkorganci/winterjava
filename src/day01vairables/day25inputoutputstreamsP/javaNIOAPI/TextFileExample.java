package day01vairables.day25inputoutputstreamsP.javaNIOAPI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextFileExample {
    public static void main(String[] args) throws IOException {

        //Reading a file
        Path path = Paths.get("src/day01vairables/day25inputoutputstreamsP/javaNIOAPI/example.txt");
        BufferedReader reader = Files.newBufferedReader(path);

        String line = reader.readLine();
        System.out.println(line);

        //Writing to a file
        BufferedWriter writer = Files.newBufferedWriter(path);
        writer.write("Wrote from bufferwriter");
    }
}
