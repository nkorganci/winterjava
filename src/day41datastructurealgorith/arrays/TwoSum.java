package day41datastructurealgorith.arrays;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
//        sum(new int[]{1, 2, 3}, 9);

        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 4, 5, 3}, 4)));

    }

    public static void sum(int[] num, int in) {

        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num.length; j++) {

                if (num[i] + num[j] == in) {
                    System.out.println(i + " " + j);
                }
            }
        }

        throw new IllegalArgumentException("No such number in this array");
    }

    public static int[] twoSum(int[] nums, int target) {

        // It works for sorted
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[2];

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }

        }
        return result;
    }

}
