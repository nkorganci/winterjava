package a02Review.garbagecollector;
public class SampleTest {
}

class A{
    public static void main(String[] args) {
        int a=9;
        try {
            System.out.println(a/0);
        }finally {
            System.out.println("final");
        }
    }
}
