package day14constructorsstatickeywordarrays_V19;

public class L03_Pet {

    // QUESTION: When I call via object many options
    // but when I call via only static nonstatic appear.

    public static void main(String[] args) {
	L02_Dog.eat(); // I can call because it is static., Short way
	L02_Dog l02_Dog = new L02_Dog(); // It was not static so I need to create object firstly.
	l02_Dog.drink();
	l02_Dog.eat(); // This is also possible but it is longer way.

	L02_Dog dog2 = new L02_Dog();

    }

}
