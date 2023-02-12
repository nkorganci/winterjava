package day42designpatterns;

public class Singleton {

    private static Singleton singleton= new Singleton();
    private Singleton(){

    }
    public static Singleton getSingleton(){
        return singleton;
    }
}

class SingletonMain{
    public static void main(String[] args) {
        Singleton obj = Singleton.getSingleton();
        Singleton obj1 = Singleton.getSingleton();
        System.out.println(obj.hashCode() +" "+ obj1.hashCode());
    }
}
