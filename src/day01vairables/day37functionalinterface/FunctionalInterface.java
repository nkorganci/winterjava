package day01vairables.day37functionalinterface;

public class FunctionalInterface {

    public static void main(String[] args) {
        B obj1 = new B();
        obj1.run("Can can run");

    }

}

class B implements Interface1 {

    @Override
    public void run(String run) {
        System.out.println(run);
    }
}

@java.lang.FunctionalInterface
interface Interface1 extends Interface2 {
    void run(String run);

    int hashCode();// Object class methods
    String toString();// Object class methods
}

interface Interface2{

}
