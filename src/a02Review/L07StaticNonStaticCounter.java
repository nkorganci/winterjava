package a02Review;

public class L07StaticNonStaticCounter {
}

class D{
    int counter1;
    static int counter2;

    D(){
        counter1++;
        System.out.println("counter1 " + counter1);
        counter2++;
        System.out.println("counter2 " + counter2);
    }

    public static void main(String[] args) {
        D obj1 = new D();
        D obj2 = new D();

        System.out.println(obj2.counter1);
        System.out.println(obj2.counter2);
    }


}
