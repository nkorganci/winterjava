package a01codingpractice;

public class AS {

    private int a = 2;
    private int b=3;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {

    }
}

class DD{
    public static void main(String[] args) {
        AS a = new AS();
        a.getA();
    }
}
