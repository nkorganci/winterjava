package Q134;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            System.out.print("Input: ");
            String input =in.readLine();
            System.out.println("Echo: "+ input);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

/*
And the command:
java Main Helloworld
What is the result ?
A. Input: Echo:
B. Input: Helloworld Echo: Helloworld
C. Input:
Then block until any input comes from System.in.
D. Input:
Echo: Helloworld
E. A NullPointerException is thrown at run time.
Answer: C
 */