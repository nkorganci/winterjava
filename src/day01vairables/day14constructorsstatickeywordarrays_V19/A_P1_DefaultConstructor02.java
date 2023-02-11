package day01vairables.day14constructorsstatickeywordarrays_V19;

public class A_P1_DefaultConstructor02 {

    String value = "a";

    public A_P1_DefaultConstructor02() {
	value = value + "b";

    }

    public A_P1_DefaultConstructor02(String c) {
	value = value + c;

    }

    public static void main(String[] args) {

	A_P1_DefaultConstructor02 order1 = new A_P1_DefaultConstructor02("r");
	A_P1_DefaultConstructor02 order2 = new A_P1_DefaultConstructor02();
	System.out.println(order1.value + order2.value);

    }

}
