package day41datastructurealgorith.arrays;

public class MissingNumber {

    public static void main(String[] args) {
        missingNum(new int[]{1,2,4,6});
    }

    public static void missingNum(int[] num) {
         int missing;

        for (int i = 0; i < num.length-1; i++) {

            if (num[i+1] - num[i ] != 1) {
                System.out.println("missing num: "  +( num[i]+1));
            }
        }

    }

    public static void missingNum2(){

    }

}