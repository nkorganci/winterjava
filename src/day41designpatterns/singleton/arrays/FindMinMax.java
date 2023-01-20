package day41designpatterns.singleton.arrays;

public class FindMinMax {
    public static void main(String[] args) {

        int[] num = {-10,2,4,1};
        int min=num[0]; // It does not matter which one is selected
        int max=num[0];
        for (int i = 0; i <num.length ; i++) {
            if(num[i]<min){
                min= num[i];
            }
            if(num[i]>max){
                max=num[i];
            }
        }

        System.out.println("min " + min + ", " + "max: " + max);

    }
}
