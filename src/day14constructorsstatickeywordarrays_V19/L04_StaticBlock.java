package day14constructorsstatickeywordarrays_V19;

public class L04_StaticBlock {
    // 1-static block is used to initialize "static(class) variables.
    // 2-Than main method will work.
    // 3-If you need some variables to initialize before constructor and main method
    // 4-A class can have multiple Static blocks

    public static int age; // it did not work firstly
    static {
	System.out.println("Firstly static block 1 is executed");
	age = 23;// it initialized the static method
    }
    static {
	System.out.println("Firstly static block 2 is executed");
	age = 24;
    }

    public L04_StaticBlock() {
	System.out.println("constructor is executed");
    }

    public static void main(String[] args) {

	System.out.println("Main method is exceuted 1");
	System.out.println(++age);
	L04_StaticBlock obj = new L04_StaticBlock();
	System.out.println("Main method is exceuted 2");

    }

}
