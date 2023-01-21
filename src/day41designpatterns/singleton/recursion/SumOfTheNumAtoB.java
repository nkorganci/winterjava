package day41designpatterns.singleton.recursion;

public class SumOfTheNumAtoB {
    public static void main(String[] args) {

        System.out.println(ex3(0,5));
    }
    public static int ex3(int a, int b){
        // Say true or false, weather the method returns sum of all numbers from a to b, a is less than b

        if(a>b){
            return 0;
        }
        return a + ex3(a+1,b); //0,1,2,3,4,5
    }
}
