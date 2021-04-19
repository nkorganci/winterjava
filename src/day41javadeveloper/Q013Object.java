package day41javadeveloper;

public class Q013Object {
}

 class Tester11 {
    private int x;
    private static int y;

    public static void main(String[] args) {
        Tester11 t1=new Tester11();
        t1.x=2;
        Tester11.y=3;
        Tester11 t2=new Tester11();
        t2.x=4;
        t2.y=5;
        System.out.println(t1.x+","+t1.y);
        System.out.println(t2.x+","+Tester11.y);
        System.out.println(t2.x+","+t1.y);

    }
}

/*What is the result?
A. 2,34,34,5
B. 2,34,54,5
C. 2,54,54,5
D. 2,34,54,3*/
//Cevap C

//Println-> should be print.