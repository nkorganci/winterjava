package day27exceptions_V40;

public class P02_Socrative02 {
}
 class Test02 {

    public static void main(String s[]) {

        String str = print(8) + print();

        print(str);

    }

     static int print() {

        return 3;

    }
     static String print(int i) {

        return "5";

    }

     static void print(String j) {

        System.out.println(j);

    }

}