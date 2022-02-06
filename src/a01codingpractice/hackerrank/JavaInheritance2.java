package a01codingpractice.hackerrank;

public class JavaInheritance2 {

    public int add(int a, int b) {
        return a + b;
    }
}


class Adder extends JavaInheritance2{


}

class Main{
    public static void main(String[] args) {
        Adder a = new Adder();
        a.add(2,4);
    }
}
