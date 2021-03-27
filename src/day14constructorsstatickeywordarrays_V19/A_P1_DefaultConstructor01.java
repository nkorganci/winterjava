package day14constructorsstatickeywordarrays_V19;

public class A_P1_DefaultConstructor01 {

    int x = 5;
    static int y = 4;

    public A_P1_DefaultConstructor01(int x, int y) { // These values update only this local variables.if static all
						     // updated.
	this.x = x;
	this.y = y;
	System.out.println("-x" + x + y);
    }

    public A_P1_DefaultConstructor01() {
	System.out.println("-x" + x + y);
    }

    public static void main(String[] args) {
	A_P1_DefaultConstructor01 mc1 = new A_P1_DefaultConstructor01(1, 1);
	A_P1_DefaultConstructor01 mc2 = new A_P1_DefaultConstructor01();

    }

}
