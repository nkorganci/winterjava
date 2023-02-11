package day01vairables.day25inputoutputstreamsP;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class P4_ByteArrayInputStream {
    public static void main(String[] args) {
        //  1==> Read data from byte arrays as streams of bytes.
        //  In other words, the ByteArrayInputStream class can turn a byte array into an InputStream.

        byte[] byteArray = {1,2,4,5};
        ByteArrayInputStream byteArrayInput = new ByteArrayInputStream(byteArray);
        ByteArrayInputStream byteArrayInput1 = new ByteArrayInputStream(byteArray,1,4);//

        System.out.println(byteArrayInput.read());//Read next element
        System.out.println(byteArrayInput.read());//Read next element

        System.out.println("Available bytes at the beginning " + byteArrayInput.available());
        for(int i = 0; i<byteArray.length;i++){
            int data = byteArrayInput.read();
            System.out.print(data + ",");
        }

        // 2==> ByteArrayOutputStream
        String str = "Hello World";
        byte[] byteOutput = str.getBytes();
        ByteArrayOutputStream byteArrayOutput = new ByteArrayOutputStream();
        try {
            byteArrayOutput.write(byteOutput);
            String newData = byteArrayOutput.toString();
            System.out.println(newData);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
