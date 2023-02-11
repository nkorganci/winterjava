package day01vairables.day35mapslambda;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class L02_ConvertSsvToMap {
    /*

    Read a csv file and convert it to a Map
    Name, Ali
    Id, 101
    Address, Miami
    School, FIU
     */

            /*

    1- readLine(): A String containing the contents of the line
    2-  BufferedReader is used to read files.
         */


    //

    public static void main(String[] args) {

        System.out.println(convertCsvToMap());
    }

    public static Map<String, String> convertCsvToMap() {


        List<String> linesList = new ArrayList<>();
        HashMap<String, String> hm = new HashMap<>();
        BufferedReader br;
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
        System.out.println(hm);

        return  hm;
    }

}
