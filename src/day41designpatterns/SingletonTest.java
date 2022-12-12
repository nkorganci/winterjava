package day41designpatterns;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonTest obj1 = new SingletonTest();
        SingletonTest obj2 = new SingletonTest();

        System.out.println(obj1.hashCode() + " " + obj2.hashCode());

    }
}
