package a01codingpractice;

//1-Polymorphisim (overriding->non-static, 2-Inheritance, 3-Encapsulation, 4-Abstraction
public class Main {
    public static void main(String[] args) {

    }
}
class Parent{
    public static void speak(){
        System.out.println("baba konusuyor static");
    }
    //Non static
    public void eat(){
        System.out.println("baba yemek yer, non static");
        //uyusun();
    }
    private void uyusun(){
        System.out.println("baba uyuyor, private");
    }
    static private void gulsun(){
        System.out.println("baba gulsun, static private");
    }
}

class Child extends Parent{
    public static void speak(){
        System.out.println("cocuk konusuyor static");
    }
    //Non static
    public void eat(){
        System.out.println("cocuk yemek yer, non static");
        //uyusun();
    }
    private void uyusun(){
        System.out.println("cocuk uyuyor, private");
    }
    static private void gulsun(){
        System.out.println("cocuk gulsun, static private");
    }
}
