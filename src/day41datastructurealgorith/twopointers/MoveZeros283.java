package day41datastructurealgorith.twopointers;

import java.util.Arrays;

public class MoveZeros283 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(moveZeros(new int[]{1,0,2,0})));

    }
    public static int[] moveZeros(int [] arr){

        //Base
        if(arr.length<2){
            return arr;
        }

        //Pointers
        int left=0;
        int right = 1;
        int length = arr.length;

        while (right<length){
            if(arr[left]!=0){
                left++;
                right++;
            }else if(arr[right]==0){
                right++;
            }else {
                int temp =arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
            }
        }
        return arr;
    }
}
