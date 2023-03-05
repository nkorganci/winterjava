package day41datastructurealgorith.arrays.udemy;

public class TwoSumArray {
    public static void main(String[] args) {


    }

    public static int[] sumInt(int [] num, int a){

        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if((num[i] +num[j]) == a){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No such solution");
    }
}
