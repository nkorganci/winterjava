package day18arraylists_V25_26_27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIsts03ArrayListMethodsEDITED {

    public static void main(String[] args) {

//	addAll();
//	addAll1();
//	clear();
//	containsAll();
//	lastIndexOf();
//	removeAll();
//	removeIf();
//	subList();
//	toArray();
	asList();

    }

    public static void addAll() {// Joining two lists
	// Appends all of the elements in the specified collection to the end of this
	// list
	List<Integer> list1 = new ArrayList<>();
	list1.add(12);
	list1.add(22);
	list1.add(33);

	List<Integer> list2 = new ArrayList<>();
	list2.add(14);
	list2.add(24);
	list2.add(34);

	System.out.println(list1.addAll(list2));// Returns true, if list1 has changed
	System.out.println(list1); // updated list1

    }

    public static void addAll1() {
	// Inserts all of the elements in the specified collection into this list at the
	// specified position
	List<Integer> list1 = new ArrayList<>();
	list1.add(12);
	list1.add(22);
	list1.add(33);

	List<Integer> list2 = new ArrayList<>();
	list2.add(14);
	list2.add(24);
	list2.add(34);

	list1.addAll(1, list2);
	System.out.println(list1);
    }

    public static void clear() {// Removes all of the elements
	List<Integer> list1 = new ArrayList<>();
	list1.add(12);
	list1.add(22);
	list1.add(33);

	list1.clear();// Removes all of the elements from this list .The list will
		      // be empty after this call returns. No returns
	// System.out.println(list1.clear());//it complain compile time error, no return
	System.out.println(list1);

    }

    public static void containsAll() {// boolean contains(Object o);
	// Returns true if this list contains the specified element
	List<Integer> list1 = new ArrayList<>();
	list1.add(12);
	list1.add(22);
	list1.add(33);

	List<Integer> list2 = new ArrayList<>();
	list2.add(14);
	list2.add(24);
	list2.add(34);

	System.out.println(list1.contains(list2));// Return true or false

    }

    public static void lastIndexOf() {// int lastIndexOf(Object o)
	// Returns the index of the last occurrence of the specified element
	// in this list, or -1 if this list does not contain the element.
	List<Integer> list1 = new ArrayList<>();
	list1.add(12);
	list1.add(22);
	list1.add(33);
	list1.add(33);
	System.out.println(list1.lastIndexOf(33));//
	System.out.println(list1.lastIndexOf(55));// Returned -1, there is no that element

    }

    public static void removeAll() {// Removes from this list all of its elements that are contained

//	Removes from this list all of its elements that are contained in the
//	specified collection
	List<Integer> list1 = new ArrayList<>();
	list1.add(12);
	list1.add(22);
	list1.add(33);

	List<Integer> list2 = new ArrayList<>();
	list2.add(14);
	list2.add(24);
	list2.add(34);

	list1.addAll(list2);// When I do not add use this, return false

	System.out.println(list1.removeAll(list2));// boolean removeAll(Collection<?> c);
	System.out.println(list1);

    }

    public static void removeIf() { // boolean removeIf(Predicate<? super E> filter)
	// Removes all of the elements of this collection that satisfy the
	// givenpredicate
	List<Integer> list1 = new ArrayList<>();
	list1.add(12);
	list1.add(22);
	list1.add(33);

	list1.removeIf(t -> t % 2 == 0);
	System.out.println(list1);

    }

    public static void subList() {// List<E> subList(int fromIndex, int toIndex);
	List<Integer> list1 = new ArrayList<>();
	list1.add(12);
	list1.add(22);
	list1.add(33);

	System.out.println(list1.subList(1, 2));

    }

    public static void toArray() {// Convert List to Array, not used often.
	List<Integer> list1 = new ArrayList<>();
	list1.add(12);
	list1.add(22);
	list1.add(33);
	System.out.println(list1);

	System.out.println(list1.toArray());// Object references is created, Object;@5d22bbb7

	System.out.println(Arrays.toString(list1.toArray()));// print Arrays
    }

    public static void asList() {// (QUESTION: Integer,int) Returns a fixed-size list backed by the specified
				 // array

	// When you convert an array to list
	// You can not change length of new List, because it is converted from array
	// Some features of List methods will not work on new List

	Integer arr[] = { 2, 4, 5 };// Question: Why we can not use int.
	System.out.println(Arrays.asList(arr));
	List<Integer> list1 = Arrays.asList(arr); // array and list must have same data type, int int, Integer Integer
	// list1.add(33);//Run time error, fixed length, converted from array
	// list1.clear();
	// list1.add(1,44);
	list1.set(0, 66);// This is supported because no change.
	System.out.println(list1);

    }

}
