package a02Review.garbagecollector;

public class Unreferenced {

    public static void main(String[] args) {
        //1) By nulling a reference:
        Unreferenced u1 = new Unreferenced();
        u1= null;
        //2) By assigning a reference to another:
        Unreferenced u2 = new Unreferenced();
        u1=u2;;//now the first object referred by e1 is available for garbage collection
        //3) By anonymous object:
        new Unreferenced();
    }
}

// Example

class TestGarbage{
    public void finalize(){
        System.out.println("Object is garbage collected");
    }

    public static void main(String[] args) {
        TestGarbage s1 = new TestGarbage();
        TestGarbage s2 = new TestGarbage();
        s1 = null;
        s2 = null;

        System.gc();
    }
}