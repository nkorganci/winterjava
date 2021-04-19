package day41javadeveloper.Q096;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q096 {
	
	
public static void main(String[] args) throws IOException {
//		
	Path currentFile = Paths.get("/Users/home/eclipse-workspace/Java11TestQuestions/src/Q096/temt.txt");
	Path outputFile = Paths.get("/Users/home/eclipse-workspace/Java11TestQuestions/src/new.txt");
    Path directory = Paths.get("/Users/home/eclipse-workspace/Java11TestQuestions/");
    
    Files.copy(currentFile, outputFile);
    Files.copy(outputFile, directory);
    Files.delete (outputFile);
//		
//		
	}
	
	// Answer C but I am not sure
	
	
	
	/*
	 * 
	 * Given the code fragment:
			Path currentFile = Paths.get(“/scratch/exam/temp.txt”);
			Path outputFile = Paths get(“/scratch/exam/new.txt”);
			Path directory = Paths.get(“/scratch/”);
			Files.copy(currentFile, outputFile);
			Files.copy(outputFile, directory);
			Files.delete (outputFile);
			The /scratch/exam/temp.txt file exists. The /scratch/exam/new.txt and /scratch/new.txt files do not exist.
			
			
			What is the result?
			A. /scratch/exam/new.txt and /scratch/new.txt are deleted.
			B. The program throws a FileaAlreadyExistsException.
			C. The program throws a NoSuchFileException.
			D. A copy of /scratch/exam/new.txt exists in the /scratch directory and /scratch/exam/new.txt is deleted.
	 * 
	 */
	

}
