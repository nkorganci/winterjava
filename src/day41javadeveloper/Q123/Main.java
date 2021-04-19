package Q123;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
      /*
        try {
            //line 1
            lines.map(1 -> 1.toUpeercase ())
            .forEach (line --> {
                try{
                Files.write(Paths.get("outputFile_to_path"),line.getBytes(),StandartOpenOption.CREATE);

            } catch (IOException e){
                    e.printStackTrace();
            }
            });
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


       */
}

}


/*
You want to obtain the Stream object on reading the file. Which code inserted on line 1 will
accomplish this?
A. var lines = Files.lines(Paths.get(INPUT_FILE_NAME));
B. Stream lines = Files.readAllLines(Paths.get(INPUT_FILE_NAME));
C. var lines = Files.readAllLines(Paths.get(INPUT_FILE_NAME));
D. Stream<String> lines = Files.lines(INPUT_FILE_NAME);
Answer: C
 */