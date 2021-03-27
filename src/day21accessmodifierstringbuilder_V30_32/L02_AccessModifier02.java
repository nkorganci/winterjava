package day21accessmodifierstringbuilder_V30_32;

import day21accessmodifierstringbuilder_ReferenceForPractice.L03_AccessModifier03;

public class L02_AccessModifier02 {
    // I coul not understand solutions of this lessons initial tests. Solve again

    /*
     * 1-To access a class member in another class by 2 ways
     * a-by class name work for static variables only, b- object of that class for
     * nonstatic
     * 2-If a member is private , you can not access from another class
     * 3a-If you dont write anything for access modifier, means it is "Default"
     * 3b-"Default" and "package private" are same.
     * 4a- Some classes can be "child" of another classes.
     * 4b- If something is "protected", they can be accessed from child classes
     * 5 - A class can not be private.
     * 6-Default ones can be accessed by only package
     */

    public static void main(String[] args) {

	// L01_AccessModifier01.name "name" did not show up, because it was not static
	L01_AccessModifier01 obj = new L01_AccessModifier01();
	System.out.println(obj.name);//
	System.out.println(obj.schoolName);//

	L03_AccessModifier03 obj2 = new L03_AccessModifier03();

    }

}