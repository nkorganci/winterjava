package day31interfacecollections;

/*
1-Until Java 8, we could not create methods with body in interfaces.
Oracle java 8 gave this chance.
2- If you want to create "method with body" in interfaces you have two options;
    a) Use "default" keywaord before return type. This default keyword is not access modifier.
    this is called "default method"
3- Differences between "default methods" and "static methods" in an interface
    a-"Default methods" can be called just by "objects" but "static methods" can be called by using
    "Interface names"
    b-If you create "default methods" or "static methods" in an interface no need to overrride them.
    Overriding is optional for "default" and "static methods"
4-
 */
public interface I03 {

    default int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a*b;
    }


}
