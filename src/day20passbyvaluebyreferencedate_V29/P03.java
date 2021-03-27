package day20passbyvaluebyreferencedate_V29;

public class P03 {
    int x;

    P03(int i) {
	x = i;
    }

    P03() {
	x = 0;
    }

}

class A {
    public static void main(String[] args) {
	P03 t = new P03(5);
	change(t);
	System.out.println(t.x);
    }

    public static void change(P03 t) {
	t.x = 10;
    }
}
