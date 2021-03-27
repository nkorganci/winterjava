package day14constructorsstatickeywordarrays_V19;

//QUESTION: Can I reach local variable via constructor or object.

public class A_P1_StaticNonStatic01 {

    static int count = 0;

    public void increment() {
	count++;
    }

    public static void main(String[] args) {

	A_P1_StaticNonStatic01 obj1 = new A_P1_StaticNonStatic01();
	A_P1_StaticNonStatic01 obj2 = new A_P1_StaticNonStatic01();
	obj1.increment();
	obj2.increment();

	System.out.println("Obj1 count: " + obj1.count);
	System.out.println("Obj2 count: " + obj2.count);

    }

}
