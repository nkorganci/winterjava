package day01vairables.day12dowhilevariablesconstructorsPractice;

public class InstanceLocalAndClassVariables {

    static int a = 1; // Class variable(static), we can use it wherever it is by using class name
    String bString = "Hi";// instance variable , in order to reach it we need create object.

    public static void main(String[] args) {

	InstanceLocalAndClassVariables.a = InstanceLocalAndClassVariables.a + 1; // direct calling dues to static
	System.out.println(InstanceLocalAndClassVariables.a);

	InstanceLocalAndClassVariables newS = new InstanceLocalAndClassVariables();
	System.out.println(newS.bString);

	int b = 2;

    }

    public void name() {

	// InstanceLocalAndClassVariables.
	// int k = 1;
    }

}
