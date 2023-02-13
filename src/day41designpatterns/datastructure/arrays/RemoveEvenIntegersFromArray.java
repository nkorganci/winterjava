package day41designpatterns.datastructure.arrays;

import java.util.Arrays;

public class RemoveEvenIntegersFromArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(oddArray(new int[]{0,2,3,4,5,9,10})));
    }

    public static int[] oddArray(int[] nums){

        int oddNumbers=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2!=0){
                oddNumbers++;
            }
        }

        int oddNumArray[]=new int[oddNumbers];
        int oddNumIndex=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2!=0){
                oddNumArray[oddNumIndex]=nums[i];
                oddNumIndex++;
            }
        }

        return oddNumArray;
    }


}
