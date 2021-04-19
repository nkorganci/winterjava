package Q156;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DenialOfService {// Answer: B
/*
    List<Reader> dataFiles = new ArrayList<>();
    File indexFile = new File("MyIndex.idx");
    try (BufferedReader indexReader = new BufferedReader(new FileReader(indexFile))){
        for(String file = indexReader.readbine();
            file != null;
            file = indexReader.readLine()) {
            BufferedReader dataReader = new BufferedReader(
                    new FileReader(new File(file))); //Line 1
            dataFiles.add(dataReader); //Line 2
            processData(dataReader); //Line 3
        }
        }catch(IOException ex){
        ...
    }finally{
        for(Reader r : dataFiles){
            try{
                r.close();
            }catch(IOException ex){
                ...
            }//Line 4
        }
    }

 */

}

//What will secure this code from a potential Denial of Service condition?
//A. After Line 4, add indexReader.close().
// B. On Line 3, enclose processData(dataReader) with try with resources.
// C. After Line 3, add dataReader.close().
// D. On Line 1, use try with resources when opening each dataReader.
// E. Before Line 1, check the size of dataFiles to make sure it does not exceed a threshold.

