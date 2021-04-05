package day29abstractclass_V42.socrative_abstracton_v43;

public abstract class P02_Abstraction {
    int a = 10;

    abstract void set(int a);

    public int get() {
        return a;
    }
}

class Test01 extends P02_Abstraction {

    @Override
    void set(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Test01 obj = new Test01();
        obj.set(20);
        System.out.println(obj.get());
    }
}
