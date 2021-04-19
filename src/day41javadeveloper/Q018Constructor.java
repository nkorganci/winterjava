package day41javadeveloper;

public class Q018Constructor {
}

 class DNASynth {
    int aCount;
    int tCount;
    int cCount;
    int gCount;

    DNASynth(int a,int tCount,int c,int g) {
        //setCCount(c) = cCount; 5=int x
        //tCount = tCount;//this.tcount deseydi olurdu.
        setGCount(g);
        cCount = setCCount(c);
        aCount = a;//t.aCount demesine gerek yok cunki aCount olarak isimlendirmemis.
    }

    int setCCount(int c) {
        return c;
    }

    void setGCount(int gCount) {
        this.gCount=gCount;
    }


}

// class Test {
//
//    public static void main(String[] args) {
//        DNASynth OBJ=new DNASynth(1, 2, 3, 4);
//        System.out.println(OBJ.aCount);
//        System.out.println(OBJ.tCount);
//        System.out.println(OBJ.cCount);
//        System.out.println(OBJ.gCount);
//
//    }
//
//}
/*
 Which two lines of code when inserted in line 1 correctly modifies instance variables? (Choose two.)
A. setCCount(c) = cCount;
B. tCount = tCount;
C. setGCount(g);
D. cCount = setCCount(c);
E. aCount = a;

Cevap C,D,E
 */
