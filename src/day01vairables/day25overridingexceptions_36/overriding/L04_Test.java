package day01vairables.day25overridingexceptions_36.overriding;

public class L04_Test extends L04_Drived {

    public static void main(String[] args) {

	L04_Drived obj = new L04_Test();
	obj.getDetails();// getDetails is coming from parent class, it did not appear in child class.
	// If you use same method in parent and child class, java executes overriding( child)

    }

    protected void getDetails() {
	System.out.println("Test Class");
	super.getDetails();// super call method or variable from parent class.

    }

}
