package day41datastructurealgorith;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class CompileTest {
    public static void main(String[] args) {
        String str = "This is a String";

        //  default charset, a bit dangerous
        byte[] output1 = str.getBytes();

        // in old days, before java 1.7
        byte[] output2 = str.getBytes(Charset.forName("UTF-8"));

        // the best , java 1.7+ , new class StandardCharsets
        byte[] output3 = str.getBytes(StandardCharsets.UTF_8);

        System.out.println(output2 + " " + output3 + " " + output1);

        int [] num = new  int[2];
        System.out.println(num);
    }
}
