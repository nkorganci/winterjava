package day41javadeveloper.Q077ArithmeticOperations;

public class Arithmetic {

    public static void main(String[] args) {
        byte x= 7;
        byte y =6;

        float z = Math.round((float) (x/y));
        float z1 = Math.round((float)x/y*100)/(float)100;

        System.out.println(z1);
    }
}
