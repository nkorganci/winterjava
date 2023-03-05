package day41datastructurealgorith.arrays;

public class SumOfDiagonals {
    public static void main(String[] args) {
        //123
        //456
        //789

        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i][i];
        }

        System.out.println(sum);

    }
}
