package a02Review;

public class L15_CovariantReturnType {
}

class D3{
    D3 get(){
        return this;
    }
}

class D4 extends D3{
    D4 get(){
       return this;
    }
    void message(){
        System.out.println("covariant return type");
    }

    public static void main(String[] args) {
        new D4().get().message();
    }
}