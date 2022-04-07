package a02Review;

import java.util.Arrays;

public class L022_Arrays {

    // Passing Array to a Method in Java
    // Find the minimum value of array
    static void min(int arr[]){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }

        System.out.println(min);
    }

    public static void main(String[] args) {

        // How to write an array in different ways
        int [] array = new int[3];
        int [] array1 = {2,0,3,4,52};

        //Print an array
        for(int a: array1){
            System.out.println(a);

            // Array question: find minimum value.
            L022_Arrays.min(array1);
        }
    }
}

// Passing Array to a Method in Java

class Array{
    void printArray(int[] arr){
        int sum = 0;
        for(int a:arr){
            sum = sum + a;
        }
        System.out.println(sum);
    }

    int[] arrayReturn(int [] b){
        b[0]=2;
        return b;
    }

    public static void main(String[] args) {
        Array obj = new Array();
       obj.printArray(new int[]{2,4,5});

       // Returning Array from the Method
        int [] c=  obj.arrayReturn(new int[]{0,0,0});
        System.out.println(Arrays.toString(c));
    }
}

// Multidimensional Java Array

class MultiArray{
    //Copying an Array in Java
    void copyArray(){

        int[] copy = {2,4,5 };
        int [] copied = new int[2];

        System.arraycopy(copy,0,copied,0,2);

        System.out.println(Arrays.toString(copied));
       // System.out.println(String.valueOf(copied));


    }

    public static void main(String[] args) {
        int [][] arrayInitialized = new int[][]{ {0,1},{2,4},{3,3}};
        for(int i=0;i<3;i++){
            for (int j = 0; j < 2; j++) {
                System.out.print(arrayInitialized[i][j]);
            }
            System.out.println();
        }

        // print copied ones
        MultiArray obj  = new MultiArray();
        obj.copyArray();
    }


}