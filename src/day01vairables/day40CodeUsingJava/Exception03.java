package day01vairables.day40CodeUsingJava;

import java.io.IOException;

/*
Explanation -
performOperation throws IOException which is a checked exception.<br>
This Exception is caught by the catch(Throwable) and exception is printed<br>
and returned. Also finally block gets executed in the end.
 */

public class Exception03 {
}

class Test04 {

   public static void main(String[] args) {
        try {
            performOperation();
        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
            return;
        }
        finally {
            System.out.println("Close everything");
        }
        System.out.println("Operation Complete");
    }

    static void performOperation() throws IOException {
        throw new IOException("Operation cannot be performed");
    }
}