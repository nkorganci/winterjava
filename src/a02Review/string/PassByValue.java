package a02Review.string;

public class PassByValue {
    int a = 100;
    void change(int a){
        a = a+ 1;
        System.out.println(a);
    }
    public static void main(String[] args) {

        PassByValue obj = new PassByValue();
        System.out.println(obj.a);
        obj.change(400);
        System.out.println(obj.a);
    }
}

class Pass{

    public static void main(String[] args) {
        int x = 5;
        change(x);
    }

    public static void change(int x){
        x=10;
    }
}