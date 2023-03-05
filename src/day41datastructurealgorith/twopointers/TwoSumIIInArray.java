package day41datastructurealgorith.twopointers;

import java.util.Arrays;

public class TwoSumIIInArray {
    public static void main(String[] args) {

        System.out.println(isSumOfThemEqual(new int[]{1,2,4},6));
        System.out.println(Arrays.toString(isSumOfThemEqualIndex(new int[]{1, 3, 5}, 40)));

    }

    public static boolean isSumOfThemEqual(int[] arr, int number) {

        // Sorted Array
        int numberFront = 0;
        int numberEnd = arr.length - 1;
        boolean isSumEqualTarget = false;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[numberFront] + arr[numberEnd] == number)) {

                isSumEqualTarget = true;
                break;
            } else if ((arr[numberFront] + arr[numberEnd]) < number) {
                numberFront++;
            } else {
                numberEnd--;
            }
        }
        return isSumEqualTarget;
    }

    public static int[] isSumOfThemEqualIndex(int[] arr, int number) {

        // Sorted Array
        int numberFront = 0;
        int numberEnd = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[numberFront] + arr[numberEnd] == number)) {
                    return new int[]{numberFront,numberEnd};
            } else if ((arr[numberFront] + arr[numberEnd]) < number) {
                numberFront++;
            } else {
                numberEnd--;
            }
        }
        return new int[]{-1,-1};
    }
}
