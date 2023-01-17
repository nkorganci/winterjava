package day42.datastructure;

import java.util.Arrays;

public class AdditionOfTwoArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(addArrays(new int[]{2,3},new int[]{0,1})));
    }

    public static int[] addArrays(int[] num1,int[] num2){

        int [] result = new int[num1.length+num2.length];

        for (int i = 0; i <num1.length ; i++) {
            result[i]=num1[i];
        }

        for (int i = 0; i <num2.length ; i++) {
            result[num1.length+i]=num2[i];
        }

        return result;
    }
}
