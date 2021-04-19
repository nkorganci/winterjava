package Q124;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));){
            String input= br.readLine();
            System.out.println("Input String was : "+ input);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
/*
Which is true?
A. System.out is the standard output stream. The stream is open only when System.out is called.
B. System.in cannot reassign the other stream.
C. System.out is an instance of java.io.OutputStream by default.
D. System.in is the standard input stream. The stream is already open.
Answer: D
 */