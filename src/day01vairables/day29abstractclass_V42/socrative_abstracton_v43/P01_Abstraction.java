package day01vairables.day29abstractclass_V42.socrative_abstracton_v43;

public abstract class P01_Abstraction {

       int a =10;

    public abstract void set(int a);

    public abstract void get();

}

class Test extends P01_Abstraction {

    @Override
    public void set(int a) {
        this.a= a;

    }

    @Override
    public void get() {

    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.set(20);
        System.out.println(obj.a);

    }
}