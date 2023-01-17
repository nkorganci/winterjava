package day42.datastructure;

import java.util.Arrays;

public class DublicateNumPrint {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(dub(new int[]{2,2,0,3,3,5})));
    }

    public static int[] dub(int [] num){
        int count=0;
        for (int i = 0; i <num.length-1 ; i++) {
            if(num[i]==num[i+1]){
                count++;
            }
        }

        int [] dubNumber= new int[count];
        int dubIndex=0;
        for (int i = 0; i < num.length-1; i++) {
            if(num[i]==num[i+1]){
                dubNumber[dubIndex]=num[i];
                dubIndex++;
            }
        }
        return dubNumber;
    }

    public static void dub2(int [] num){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    System.out.println(num[i]);
                }
            }
        }


    }
}
