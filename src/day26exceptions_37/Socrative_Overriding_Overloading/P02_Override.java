package day26exceptions_37.Socrative_Overriding_Overloading;

public class P02_Override {
    void display(){
        System.out.println("Good");
    }

}
class B1 extends P02_Override{
    @Override
    void display() {
        System.out.println("Bad");
    }

    public static void main(String[] args) {
        P02_Override obj = new B1();
        obj.display();
    }
}
