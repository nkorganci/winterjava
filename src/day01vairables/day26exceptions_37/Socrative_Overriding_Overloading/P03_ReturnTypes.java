package day01vairables.day26exceptions_37.Socrative_Overriding_Overloading;


public class P03_ReturnTypes {
    public int fly(){
        System.out.println("A flies");
        return 3;
    }
}

class B2 extends P03_ReturnTypes{
    @Override
    public int fly() {
        System.out.println("B flies");
        return 5;
    }
}

class C2 {
    public static void main(String[] args) {
        P03_ReturnTypes obj = new B2();

        obj.fly();

    }
}