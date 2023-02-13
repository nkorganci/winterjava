package day41designpatterns.datastructure.twopointers;

public class MaximumSumSubArrayInK {
    public static void main(String[] args) {

    }

    public static int findMax(int[] a, int k) {

        int windowsSum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            windowsSum += a[i];
        }
        for (int i = k; i < a.length; i++) {
            windowsSum += a[i] - a[i - k];
            maxSum = Math.max(maxSum, windowsSum);
        }
        return maxSum;


    }
}
