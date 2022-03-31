package a02Review;

public class L10_Inheritance {
    int a =2;
    static int b= 33;

    void calculate(){
        System.out.println(a*a);
    }
}

class C3 extends L10_Inheritance{
    int a=3;
    static int b= 333;

    public void fieldVariables(){
        System.out.println(a + " " + super.a); // in a non-static method I can reach to both of them. If there is no field variable in child class, it uses parent one.
    }
    public static void main(String[] args) {
        C3 obj = new C3();
        obj.calculate();
        obj.fieldVariables();
        System.out.println(obj.a); // Child class will show up , parent field will be hidden
        System.out.println();
    }
}
