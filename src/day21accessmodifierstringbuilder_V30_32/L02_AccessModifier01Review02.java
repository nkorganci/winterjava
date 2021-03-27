package day21accessmodifierstringbuilder_V30_32;

public class L02_AccessModifier01Review02 {
    int x = 4;

    public static void main(String[] args) {
	L01_AccessModifier01Review01 obj1 = new L01_AccessModifier01Review01();// Created object In order to get methods or instances of another class

	// I could not call "private" instance
	System.out.println(obj1.publicString);
	System.out.println(obj1.defaultString);
	System.out.println(obj1.protectedString);

	// I could not call "private" method
	obj1.publicMethod();
	obj1.defaultMethod();
	obj1.protectedMethod();

	// QUESTION: Why I can not reach to any variable or method in another class.
	L02_AccessModifier01Review02 obj2 = new L02_AccessModifier01Review02();

    }

}
