package day23encapsulationInheritance_V34;

public class L02_Encapsulation02 {

    public static void main(String[] args) {

	L01_Encapsulation01 obj1 = new L01_Encapsulation01(); // I can not see name, age in L01_Encapsulation01 class
							      // because they are private.
	obj1.getAge();// After encapsulation, we can reach to any private variables via setter and
		      // getter.

    }

}
