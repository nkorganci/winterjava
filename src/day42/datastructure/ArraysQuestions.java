package day42.datastructure;

import java.util.Arrays;

public class ArraysQuestions {
    public static void main(String[] args) {

//        System.out.println(Arrays.toString(reverseArray(new int[]{1, 2, 3})));
//        System.out.println(minValue(new int[]{1,3,-3}));
//        System.out.println(secondMax(new int[]{1, 2, 9, 9, 0}));
        System.out.println(Arrays.toString(moveZero(new int[]{0,2,2,0,3,0,5})));

    }

    public static int[] reverseArray(int[] arr) {


        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - i - 1];
        }

        return reversedArray;
    }

    public static int minValue(int[] num) {
        int min = num[0];
        for (int i = 0; i < num.length; i++) {

            if (num[i] < min) {
                min = num[i];
            }
        }
        return min;

    }

    public static int secondMax(int[] num) {

        Arrays.sort(num);
        int secondMax = num[num.length - 2];

        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] != num[i - 1]) {
                secondMax = num[i - 1];
                break;
            }
        }

        return secondMax;
    }

    public static int[] moveZero(int[] num) {

        int num1 = 0;
        int zero1 = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                zero1++;
            } else {
                num1++;
            }
        }

        int [] num2 = new int[num1];
        int [] zero2= new int[zero1];

        int numIndex=0;
        int zeroIndex=0;

        for (int i = 0; i <num.length ; i++) {
            if(num[i]==0){
                zero2[zeroIndex]=num[i];
                zeroIndex++;
            }else {
                num2[numIndex]=num[i];
                numIndex++;
            }
        }

        int[] result=new int[num.length];

        for (int i = 0; i <num2.length ; i++) {
            result[i]=num2[i];
        }

        for (int i = 0; i <zero2.length ; i++) {
            result[result.length-i-1]=zero2[i];
        }


            return result;
    }

}
