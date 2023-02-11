package day01vairables.day24inheritanceoverriding_V35;

public class L11_Animal {

    public static int height;
    public int weight;

    public L11_Animal() {
	this(5);// It will got o constructor which has int paremeter in this class.
	System.out.println("Animal constructor without parameter...");
    }

    public L11_Animal(int a) {
	System.out.println("Animal constructor with int parameter");
    }

    public L11_Animal(int height, int weight) {
	this.height = height;
	this.weight = weight;
    }

}
