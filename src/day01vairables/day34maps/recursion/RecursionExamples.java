package day01vairables.day34maps.recursion;

public class RecursionExamples {
    public static void main(String[] args) {
//        System.out.println(ex1(7));
//        System.out.println(ex2(3,6));


    }

    public static int ex1(int num) {

        if (num == 10)
            return num;
        return num + ex1(num+1); // it will return num + num + 1 + ex1(num+1), 7,8,9
    }                                                   //7    7             8

    public static int ex2(int a,int b){
        if(a==b)
            return a; // The last one is coming from here
        return a+b+ex2(a+1,b-1); // 2,6, 3,5
    }


}
