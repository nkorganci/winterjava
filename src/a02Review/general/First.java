package a02Review.general;

public class First {
int a = 1;
static int b = 2;
    First(){
        a =11;
        b=22;
        System.out.println(a+ " " + b);
    }

    public void run(){
        a=938;
    }

    public static void main(String[] args) {
        First obj = new First();
        System.out.println(obj.a + " " + obj.b);

        First obj1 = new First();
        System.out.println(obj.a + " " + obj.b);

    }
}
