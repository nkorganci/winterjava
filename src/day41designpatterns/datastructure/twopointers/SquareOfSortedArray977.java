package day41designpatterns.datastructure.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SquareOfSortedArray977 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(SquareOfArray(new int[]{1, 2, 4})));
        System.out.println(Arrays.toString(square(new int[]{2, 5, 1})));
    }

    public static int[] SquareOfArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i] * arr[i];
        }
        return arr;

    }

    public static int[] square(int[] arr) {

        List<Integer> list = new ArrayList<>();
        for (Integer num : arr) {
            list.add(num);
        }
        List<Integer> sL = list.stream().map(t -> t * t).sorted().collect(Collectors.toList());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sL.get(i);
        }
        return arr;
    }

    public static int[] sortedSquares1(int[] arr) {
        //Result Array
        int[] res = new int[arr.length];

        //Pointers for left and right
        int left = 0;
        int right = arr.length - 1;

        //Iterate from n t 0
        for (int i = arr.length; i >= 0; i--) {
            //Check if abs left is less than or equal to abs right
            if (Math.abs(arr[left]) >= Math.abs(arr[right])) {
                //add left squared to result array
                res[i] = arr[left] * arr[left];
                //Increment left pointer
                left++;
            } else {
                //add right squared to result array
                res[i] = arr[right] * arr[right];
                //decrement right pointer
                right--;
            }
        }
        return res;
    }
}
