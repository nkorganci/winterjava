package day41datastructurealgorith.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSumNotSorted(new int[]{3, 2, 4}, 6)));

    }


    // SORTED, TWO POINTER
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        int[] result = new int[2];

        Arrays.sort(nums);

        while (left < right) {
            if ((nums[left] + nums[right]) == target) {
                result[0] = left;
                result[1] = right;
                break;
            } else if ((nums[left] + nums[right]) < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    //NOT SORTED, TWO POINTER

    public static int[] twoSumNotSorted(int[] nums, int target) {

        int n = nums.length;
        int[] idx = new int[2];

        int i = 0;
        int j = i + 1;

        while (i < j) {

            if ((nums[i] + nums[j]) == target) {
                idx[0] = i;
                idx[1] = j;
                break;
            } else if (j == n - 1) {
                i++;
                j = i + 1;
            }else {
                j++;
            }
        }
        return idx;

    }


    // If array is not sorted, HASHMAP
    public static int[] twoSumHashMap(int[] nums, int target) {


        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(target - nums[i])) {
                return new int[]{numMap.get(target - nums[i]), i};
            }

            numMap.put(nums[i], i);

        }
        throw new IllegalArgumentException("No match found");
    }
}
