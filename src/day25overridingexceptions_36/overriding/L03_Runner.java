package day25overridingexceptions_36.overriding;

public class L03_Runner {

    public static void main(String[] args) {

    }

    public static void a() {
	/*
	 * 0-Definition of overriding:
	 * If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
	 * If a subclass provides the specific implementation of the method that has been declared by one of its parent class
	 * Method overriding is used for runtime polymorphism
	 */

	/*
	 * 1- Create an object whose data type is Animal, constructor is Dog.
	 * e.g: L01_Animal obj1 = new L02_Dog();
	 * 2- When you create an object you may use parent classes as data type.
	 * 3- Data type from parent class object name constructor is from child class which is better. Flexible
	 * 4- All parents can be selected as data type
	 * 7- IMPORTANT: If there are two same methods in parent class and child class
	 * a- If data type is parent, obj will get the method from only parent method
	 * b- If data type is child, obj will get data from only child class, will ignore the parent class (if they have same method)
	 * c- Java look at data type first of all, if there is method it will use, otherwise , it will go parent class.
	 * 8- QUESTION??When you call a variable check the data type (left side)
	 * 9- When you call a method check the constructor (right side)
	 * 10- If a method is final, you can not change its body. So when there is a final class, no overriding, CTE.
	 * 11- If something is static(common), no need to rewrite, static methods can not be overridden.
	 * 12- add(), add(int a) are completely different methods. They have different parameters.
	 * 13- Method overloading can be done in the same class.
	 * 14- static , private` and final methods can not be overriden but they can be overloaded.
	 * 15- When you check overriding check return types, there should be IS-A , HAS-A relationship.
	 * 16- Between wrapper classes there is no child parent relationship( Short, Integer). Gives CTE.
	 * 17- If you dont write @Override annotation, java will not check overriding requirements.
	 */

	// 1st Way
	L01_Animal obj1 = new L02_Dog();// can access only name, height- drink() method
	// This way of object creation is more general.
	// obj1 get only variables and method from Animal(parent) class. I could not get any data from child class(dog).
	// obj1.height;
	// obj1.name;
	// obj1.drink();

	// 2nd Way
	L02_Dog obj2 = new L02_Dog();// Can access everything from child and parent class.birthYear, tail, name,height-drink(), bark() methods too.

	// This is from dog class, i could not get drink() from Animal. Constructors goes from child to parent at calling.
	// If parent and child class has same methods() look at the data types to understand which one will be called.
	// Note: If you use "Parent class" as data type, the class members in child class will be unaccesible.
	// Note2: If data type is "Child Class" you may reach both child and parent class members.
	obj2.drink();

	// List<> a = new ArrayList<>();//List is the parent of ArrayList
	// Object obj3 = new L02_Dog();// As you see no complaining too

    }

}
