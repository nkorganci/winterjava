package day01vairables.day34maps.recursion;

public class ProductOfArray {

    public static void main(String[] args) {
        System.out.println(productOfArray(new int[]{1,3,4}));
    }

    public static int productOfArray(int [] arr){

        int result = 1;
        for (int i = 0; i < arr.length; i++) {

            result *= arr[i];
        }
        return result;
    }
}
