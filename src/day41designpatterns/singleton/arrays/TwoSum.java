package day41designpatterns.singleton.arrays;

public class TwoSum {

    public static void main(String[] args) {
        sum(new int[]{1,2,3},9);

    }

    public static void sum(int[] num, int in){

        for (int i = 0; i < num.length ; i++) {

            for (int j = 0; j < num.length; j++) {

                if(num[i]+num[j]==in){
                    System.out.println(i+" "+ j);
                }
            }
        }

        throw new IllegalArgumentException("No such number in this array");
    }

}
