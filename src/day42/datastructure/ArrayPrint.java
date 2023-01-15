package day42.datastructure;

import java.util.Arrays;

public class ArrayPrint {
    public static void main(String[] args) {

        arrayP(new int []{2,4});
        removeEven(new int[]{2,4,1});
    }
    public static void arrayP(int [] arr){
        for (int i = 0; i <arr.length ; i++) {

            System.out.println(arr[i]);
        }
    }

    public static void removeEven(int[] arr){

        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                count++;
            }
        }

        int [] oddArray = new int[count];

        int oddIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                oddArray[oddIndex]=arr[i];
                oddIndex++;
            }
        }

        System.out.println(Arrays.toString(oddArray));
    }
}
