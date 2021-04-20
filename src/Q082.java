import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Q082 {

    public static void main(String[] args) {
        Foo f1 = new Foo();
        Foo f2 = new Bar();
        Bar b1 = new Bar();

        List<String> c = new ArrayList<>();

        f1.foo(c);
        f2.foo(c);
        b1.foo(c);
    }
}

class Foo {

    public void foo(Collection arg) {
        System.out.println("Bonjouur");
    }
}

class Bar extends Foo {


    public void foo(Collection arg) {
        System.out.println("Hello world");
    }

    public void foo(List arg) {
        System.out.println("Ola");
    }
}