package day41designpatterns.datastructure.chase;

public class UglyNumbersFactors235 {

    public static void main(String[] args) {
        uglyNumbers(9);
    }

    public static boolean uglyNumbers(int num) {

        for (int i = 2; i < 6; i++) {
            while (num%i==0){
                num=num/i;
            }
        }

        return num==1;
    }


}
