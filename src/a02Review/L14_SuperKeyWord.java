package a02Review;

public class L14_SuperKeyWord {
}
// 1 Super is used to call parent variable or method
class E{
    String name ="Parent E string";
    void print(){
        System.out.println("parent E");
    }
}
class E1 extends E{
    String name = super.name;
    void print(){
        super.print();
        System.out.println("child e1");
    }
}

class M{
    public static void main(String[] args) {
        E1 obj = new E1();
        obj.print();
    }
}

// 1) super is used to refer immediate parent class instance variable.
