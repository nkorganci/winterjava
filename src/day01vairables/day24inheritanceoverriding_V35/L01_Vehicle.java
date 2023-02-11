package day01vairables.day24inheritanceoverriding_V35;

public class L01_Vehicle {

    public void move() {// I can change "Public" to "private" or "default" because only child class can not reduce visibility.
			// but i make "private" child class can not access, gives error.
	System.out.println("Vehicles move");
    }

    public void engine() {
	System.out.println("Vehicles have engine");
    }

    public int spend() {
	System.out.println("Vehicles spend fuel");
	return 11;
    }

    public Object speak() {// Return type is non-primitive
	return "Hello World...";
    }
}
