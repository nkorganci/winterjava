package day34maps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapQuestions03HW {
/*
    Create a method to convert a csv file to a map
    Example:

    Name, Ali
    Id, 101
    City, Miami  ==>

    {Name=Ali, Id=101, City=Miami}

 */

    public static void main(String[] args) {
        csv();
    }

    public static void csv() {

        List<String> list = new ArrayList<>();

        BufferedReader br;
        HashMap<String, String> hm = new HashMap<>();
        try {
            br = new BufferedReader(new FileReader("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day34maps\\sample.csv"));

            String line = br.readLine();
            while (line != null) {

                String arr[] = line.split(",");
                hm.put(arr[0].trim(), arr[1].trim());

                line = br.readLine();
            }
            System.out.println(hm);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}