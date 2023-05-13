package day01vairables.day28exceptions_41;

import java.util.Arrays;

public class ChainedExceptions {


}

class ChainExample{
    public static void main(String[] args) {
        int[] array = new int[5];
        try {

            array[10] = 1;
        }catch (ArrayIndexOutOfBoundsException e ){
            array[2] =4;
            throw new RuntimeException("Error in arrayasdf ", e );
        }

        System.out.println("Ended " + array[2]);
    }
}
