package day01vairables.day20passbyvaluebyreferencedate_V29;

import java.util.ArrayList;
import java.util.List;

public class L01_PassByValuePassByREference {
    // QUESTION: Can I call a method from another method, except main.
    // Java use as passbyvalue, others use pass by reference

    public static void main(String[] args) {
	int price = 100;
	// Java keeps original value, it give copy of the value to another method.
	// You may change by assigning new value where it is created,
	// It creates another container.
	// When you use a variable inside of a method, java uses copy of that variable.
	// Because the other method created a new variable, we use just values.
	// This is called passbyvalue
	// PassByeReference shares original value( reference), so its value also updated
	// It does not create new container.
	System.out.println(discount(price));// Return 90, because it is assigned in another method,

	System.out.println(price);// Return 100

	// non-primitive, immutable, original value can not be updated.
	String str = "Java";
	System.out.println(concatenate(str));// Java uses copy of str, because it is called in another method which
					     // created a new container.
	System.out.println(str);

	// Original List automatically updated without assigning
	// When you use List in anoter method it creates new container and return its
	// values to original one.
	List<Integer> list = new ArrayList<>();
	list.add(11);
	list.add(12);
	list.add(13);

	updateAllelements(list);

	System.out.println(list);

    }

    public static int discount(int price) {
	price = price - 10;
	return price;

    }

    public static String concatenate(String str) {
	str = str + "X";
	return str;

    }

    public static List<Integer> updateAllelements(List<Integer> list) {
	// Lists are mutable, string immutable
	// when you update List, it update original one too
	// But String origin will not be updated.

	for (int i = 0; i < list.size(); i++) {

	    list.set(i, list.get(i) + 3);
	}

	System.out.println(list);
	return list;

    }

}
