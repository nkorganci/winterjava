package day41designpatterns.singleton.arrays.udemy;

public class MissNum {

    public static void main(String[] args) {

        System.out.println(a1(5, new int[]{1,2,4,5}));
    }

    public static int a1(int num, int[] arr) {

        int sumAll=num;
        for (int i = 1; i < num; i++) {
            sumAll +=i;
        }

        int sumArr=0;
        for (int i = 0; i < arr.length; i++) {
            sumArr +=arr[i];

        }
        return sumAll - sumArr;
    }

    public static int a2(int[] num) {

        return 0;
    }

    public static int a3(int[] num) {

        return 0;
    }

    public static int a4(int[] num) {

        return 0;
    }

}


