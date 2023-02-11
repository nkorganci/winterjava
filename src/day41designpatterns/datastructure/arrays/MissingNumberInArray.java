package day41designpatterns.datastructure.arrays;

public class MissingNumberInArray {

    public static void main(String[] args) {



    }

    public static void missingNum(){
        // Array should not have duplicate
        // Array no need to be sorted
        // Values should be in range

        int[] num = {3,5,6};
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum +=num[i]; // sum of the numbers at given index, it might missing
        }

        int sumNum=0;
        for (int i = 3; i <=6 ; i++) {
            sumNum +=i; // sum of the perfect all numbers in array
        }

        System.out.println(" Differences: Missing Number " + (sumNum - sum) );
    }

    public static void missingNum2(int[] num ){

        int[] numSorted = new int[num.length];

        for (int i = 0; i < num.length; i++) {

        }
    }

}
