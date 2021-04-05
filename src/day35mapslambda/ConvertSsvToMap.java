package day35mapslambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertSsvToMap {
    /*

    Read a csv file and convert it to a Map
    Name, Ali
Id, 101
Address, Miami
School, FIU
     */

    public static void main(String[] args) {

        System.out.println(convertCsvToMap());
    }

    public static Map<String, String> convertCsvToMap() {

        BufferedReader br;
        List<String> linesList = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();
        try {

            br = new BufferedReader(new FileReader("C:\\Users\\nuri.korganci\\IdeaProjects\\winterjava\\src\\day35maps\\myfile.csv"));
            String line = br.readLine();

            while (line!=null){
                linesList.add(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("File could not be read" + e.getMessage());
        }

        for(String w: linesList){
            String  arr[] = w.split(",");
            hm.put(arr[0].trim(),arr[1].trim());
        }

        return  hm;
    }

}
