package a02Review.garbagecollector;

public class SampleTest {
}


class A{
    public static void main(String[] args) {

        int a = 2;
        try {
            System.out.println(a/0);
            throw  new ArithmeticException("no zeor");
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);;
        }
    }
}