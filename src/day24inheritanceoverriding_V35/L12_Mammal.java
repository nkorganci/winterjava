package day24inheritanceoverriding_V35;

public class L12_Mammal extends L11_Animal {

    public boolean haveBaby;
    public int height;

    public L12_Mammal() {
	super(5);// dog(child) constructor will call parent(Animal) constructor which has int 5.
	// super("A") if Animal constructor has no variable with String, CTE. Mammal or dog can not reach.

	System.out.println("Mammal constructor without parameter...");

    }

    public L12_Mammal(boolean haveBaby) {
	super(3, 4); // animal with 2 integer parameter will be used
	// super(); //animal without parameter will be used.
	this.haveBaby = haveBaby;

    }

}
