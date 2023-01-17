package day42.datastructure;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortArr(new int[]{2,1,3,0})));
        
    }
     public static int[] sortArr(int [] num){
         for (int i = 0; i <num.length ; i++) {
             for(int j=i+1;j<num.length;j++){
                 if(num[i]>num[j]){
                     int temp=num[i];
                     num[i]=num[j];
                     num[j]=temp;
                 }
             }
         }

         return num;
     }
}

