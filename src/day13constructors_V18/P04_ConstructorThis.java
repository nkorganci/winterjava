package day13constructors_V18;

public class P04_ConstructorThis {

    String name;
    int age;
    String phone;

    P04_ConstructorThis() {
    }

    P04_ConstructorThis(String name, int age, String phone) {
	this.phone = phone;
	this.name = name;
    }

    public static void main(String[] args) {

	P04_ConstructorThis s1 = new P04_ConstructorThis();// There is no parameter, default values will be written
	System.out.println(s1.name + " " + s1.age + " " + s1.phone);

	P04_ConstructorThis s2 = new P04_ConstructorThis("Jhon", 33, "343");
	System.out.println(s2.name + ", " + s2.age + "," + s2.phone);

    }

}
