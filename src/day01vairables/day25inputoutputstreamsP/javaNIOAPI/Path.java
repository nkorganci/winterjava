package day01vairables.day25inputoutputstreamsP.javaNIOAPI;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Path {

    public static void main(String[] args) {
//        Path path = Path.get("C:\\Users\\nkorg\\Downloads\\Projects\\winterjava\\src\\day01vairables\\day25inputoutputstreamsP\\javaNIOAPI\\path.txt");
        Path path = (Path) Paths.get("C:\\Users\\nkorg\\Downloads\\Projects\\winterjava\\src\\day01vairables\\day25inputoutputstreamsP\\javaNIOAPI\\path.txt");
        boolean exists = Files.exists((java.nio.file.Path) path);
    }
}
