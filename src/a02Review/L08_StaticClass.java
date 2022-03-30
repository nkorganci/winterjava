package a02Review;

public class L08_StaticClass {
}

class D1{
    int a=3;
    static int  b = 4;
    static void a1(){
        System.out.println("a1 static");
    }
    void a2(){
        System.out.println("a2 non static");
    }

    static class D2{
        public static void main(String[] args) {

            D1.a1();
            D1.b=3;

            D1 d1 = new D1();
            d1.a2();
        }
        static void a1Inner(){
            System.out.println("a1 inner static");
        }
        void a2Inner(){
            System.out.println("a2 non static");
        }

    }

    public static void main(String[] args) {
        D2.a1Inner();

    }
}
