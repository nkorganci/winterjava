package day12dowhilevariablesconstructorsPractice;

public class MyClass {

    public static void main(String[] args) {

	for (int i = 0; i <= 30; i++) {

	    if (i % 3 == 0) {
		System.out.println("Rock");
	    } else {
		if (i % 5 == 0) {
		    System.out.println("Star");
		} else if (i % 3 == 0 && i % 5 == 0) {
		    System.out.println("Rockstar");
		} else {
		    System.out.println(i);
		}

	    }

	}
    }
}
