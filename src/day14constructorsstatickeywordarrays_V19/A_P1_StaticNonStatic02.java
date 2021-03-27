package day14constructorsstatickeywordarrays_V19;

public class A_P1_StaticNonStatic02 {

    int number;
    String name;
    static String co = "ITS";

    public A_P1_StaticNonStatic02(int r, String n, String co) {
	this.number = r;
	this.name = n;
	this.co = co;
    }

    public static void main(String[] args) {

	A_P1_StaticNonStatic02 s1 = new A_P1_StaticNonStatic02(111, "Karan", "MIT");
	A_P1_StaticNonStatic02 s2 = new A_P1_StaticNonStatic02(222, "Aryan", "Harvard");

	System.out.println(s1.number);
	System.out.println(s2.number);

	System.out.println(s1.name);
	System.out.println(s2.name);

	System.out.println(s1.co);
	System.out.println(s2.co);

    }

}
