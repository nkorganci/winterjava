package day21accessmodifierstringbuilder_ReferenceForPractice;

import day21accessmodifierstringbuilder_V30_32.L01_AccessModifier01Review01;

public class L01_AccessModifier01Review01Reference extends L01_AccessModifier01Review01 {
	/*
	overloading--> different parameter same class--> Compile time error
	overriding --> Inheritance from different classes--> rurn time error
	 */
    int a = 3;

    public static void main(String[] args) {

	// I can call public and protected because this is a child class. Crate constructor of this class.


	L01_AccessModifier01Review01Reference obj = new L01_AccessModifier01Review01Reference();
	obj.protectedMethod();
	obj.publicMethod();

	L01_AccessModifier01Review01 obj1 = new L01_AccessModifier01Review01();
	obj1.publicMethod();

    }

    public void aaa() {
	// I can call them in a public, not main method which is static.
	protectedString = "Hi";
	publicString = "a";
	a = a + 2;

    }

}
