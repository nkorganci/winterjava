package day17arraylists_V24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L01_ArrayLIsts {

    /*
     1-Size of Array can not be modified, you need to create new array if you would like to add or remove element
     2- ArrayList can be modified whenever you want, flexible in length.
     3- ArrayList must contain non-primitive data types(String, Integer, but not int..)
     4- ArrayList and Arrays are same in data types
     5- ArrayList is an updated object, updated version of Arrays
     6-
     */
    public static void main(String[] args) {

toArray();
    }

    public static void add() {


        int a[] = new int[2];// data type is int for array
        ArrayList<Integer> arr = new ArrayList<>();//Both or one side may have data type

        ArrayList<Integer> list = new ArrayList<>(5);//You may/not add, no problem

        //1st Way
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list); //[1, 2, 3]
        System.out.println(list.add(4)); // true

        //2nd Add() method:
        list.add(0, 99);
        System.out.println(list);

        //3rd Add() method
        //list.add(44,9);// Runtime Error, IndexOutOfBoundsException
        System.out.println(list);

    }//1- boolean add(E e), Appends the specified element to the end of this list
                                // 2- void add(int index, E element ,Inserts the specified element at the specified position in this list.

    public static void addAll() {

        // Appends all of the elements in the specified collection to the end of this list
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

    }//boolean addAll(Collection<? extends E> c);, Appends all of the elements in the specified collection to the end of this list,

    public static void addAll1() {
        // Inserts all of the elements in the specified collection into this list at the specified position
        //
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
    }// boolean addAll(int index, Collection<? extends E> c);
                                                        // Inserts all of the elements in the specified collection into this list at the specified position
    public static void asList() {// Returns a fixed-size list backed by the specified array
          /*
            When you convert an array to list You can not change length of new List,
            because it is converted from array Some features of List methods will not work on new List
          */

        //1- PRINT
        Integer arr[] = {3, 4, 5};
        System.out.println(Arrays.asList(arr));//[3, 4, 5], Print array as string
        List<Integer> list1 = Arrays.asList(arr); // array and list must have same data type, int int, Integer Integer
        System.out.println(list1); // [3, 4, 5], Print arraylist to string

        // list1.add(33);  //Run time error, fixed length, converted from array
        // list1.clear();  //Run time error, fixed length, converted from array
        // list1.add(1,44);//Run time error, fixed length, converted from array

        //2-UPDATE
        list1.set(0, 66);// This is supported because no change.
        System.out.println(list1);

        // Array to String
        String[] array = {"a", "b", "c", "d", "e"};

        System.out.println(array[0]);// String array can be printed directly with index number

        System.out.println(array); // Array can not be printed directly, it return only reference
        System.out.println(Arrays.toString(array));

        // Method 1: Arrays.asList()
        List<String> list = Arrays.asList(array);// Returns a fixed-size list backed by the specified array.
        System.out.println(list);

        // Method 2: Collections.addAll()
//	List<String> list1 = new ArrayList<String>();
//	Collections.addAll(list1, array);// Adding all elements
//	Collections.addAll(list1, "Peaches 'n Plutonium", "Rocky Racoon");// Adding Individual elements
//
//	System.out.println(list1);

        // Method 3: Iteration method
        List<String> list2 = new ArrayList<>();
        for (String text : array) {
            list2.add(text);
        }
        System.out.println(list2);
    }// <T> List<T> asList(T... a), return new ArrayList<>(a); Returns a fixed-size list backed by the specified array.

    public static void clear() {// Removes all of the elements
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(22);
        list1.add(33);

        list1.clear();// Removes all of the elements from this list .The list will
        // be empty after this call returns. No returns
        // System.out.println(list1.clear());//it complain compile time error, no return
        System.out.println(list1);

    }//void clear(); Removes all of the elements from this list

    public static void contain() {// contains(Object o)
        // How to check a list has a specific element
        // Returns true if this list contains the specified element.
        ArrayList<String> list = new ArrayList<>();
        list.add("0");
        list.add("1");
        list.add("2");
        System.out.println(list.contains("1"));// Return true

    }//boolean contains(Object o)

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

    }//boolean contains(Object o);

    public static void empty() {// return true or false
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(0);
        list1.add(2);
        list1.add(3);

        System.out.println(list1.isEmpty());// return 0 if size == 0
    }// boolean isEmpty(), no elements

    public static void equals() {

    	// Arrays are objects so we dont use "==" to compare arrays

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list.equals(list1));

    }//boolean equals(Object o), In other words, two lists are defined to be equal if they contain the same elements in the same order

    public static void ex_closestTwoElements() {// COULD NOT UNDERSTAND, From the integer list, find the closest two
        // elements.

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(43);
        list1.add(31);
        list1.add(12);
        list1.add(78);
        list1.add(16);
        list1.add(67);

        List<Integer> differences = new ArrayList<>();

        List<String> indexes = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            for (int k = i + 1; k < list1.size(); k++) {
                differences.add(Math.abs(list1.get(i) - list1.get(k)));
                indexes.add(i + "" + k);
            }
        }
        System.out.println(differences);
        System.out.println(indexes);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < differences.size(); i++) {
            if (min > differences.get(i)) {
                min = differences.get(i);
            }
        }
        System.out.println(min);

        int idxMin = differences.indexOf(min);
        String str = indexes.get(idxMin);
        System.out.println(str);

        System.out.println("First number: " + list1.get(Integer.valueOf(str.substring(0, 1))));
        System.out.println("Second number: " + list1.get(Integer.valueOf(str.substring(1, 2))));

    }

    public static void ex_doWhile() {

        ArrayList<String> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Write 5 choice: ");

        for (int i = 0; i < 5; i++) {
            String input = scan.next();
            arr.add(input);
        }

        System.out.println("Select one of the option: ");
        int input1 = scan.nextInt();

        do

            if (input1 == 1) {

                System.out.println("Add a number");

            }
        while (input1 == 1);
    }

    public static void ex_repeatedElements() {

        // How to remove repeated elements
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("3");

        ArrayList<String> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (!list1.contains(list.get(i))) {
                list1.add(list.get(i));
            }

        }
        System.out.println(list1);

    }// Remove repeated elements

    public static void ex_replace() {//

        // TASK:Ask user to enter a letter, if letter exists in the list, convert it to
        // "Got It", otherwise add the element to the list

        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("Love");
        list.add("Java");

        Scanner scan = new Scanner(System.in);
        System.out.println("Write a letter: ");
        String input = scan.nextLine().substring(0, 1);

        if (list.contains(input)) {
            System.out.println(list.set(list.indexOf(input), "Got It"));

        } else {
            list.add(input);

        }

        System.out.println(list);
        scan.close();
    }

    public static void ex_uniqueElements() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write five word: ");
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String input = scan.nextLine();

            if (!arr.contains(input)) {
                arr.add(input);

            }

        }
        System.out.println(arr);

    }

    public static void get() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(3);

        // How to get a specific element from a list
        System.out.println(list1.get(2));// 2 is index number
        // System.out.println(list1.get(33));//Run time error

    }// get(int index), Returns the element at the specified index in this list.

    public static void indexOf() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(22);
        list1.add(33);
        list1.add(33);
        System.out.println(list1.indexOf(43));

    }//int indexOf(Object o);, Returns the index of the first occurrence of the specified element in this list,

    public static void lastIndexOf() {

        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(22);
        list1.add(33);
        list1.add(33);
        System.out.println(list1.lastIndexOf(33));//
        System.out.println(list1.lastIndexOf(55));// Returned -1, there is no that element, -1 if this list does not contain the element.

    }// int lastIndexOf(Object o), Returns the index of the last occurrence of the specified element

    public static void remove() {


        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.remove(1));// removing object at index 1 i.e. 2nd Object, which is 3 element as
        // IMPORTANT:For Integer lists, we can not use the remove method which accept parameter
        // Remove method accept it as index number.
        // System.out.println(list1.remove(3)); //I can not remove 3 by writing elemement name 3
        System.out.println(list1);

        // Remove method for String()
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Hi");
        list2.add("bye");
        list2.add("home");
        System.out.println(list2);

        System.out.println(list2.remove("home"));// true, yes it is removed
        System.out.println(list2);// This list will not have home, but if it would be String, there will be home.

        // Lists is mutable but Strings are immutable
        // Q: When I assign it to a , it is mutable???
        String a = "How are you";

        System.out.println(a.replace("How", ""));// The resulting string
        // a = a.replace("How", "");// If you assign to itself or another String, it
        // changes
        a.replace("How", "");// if you dont assing , String will not change
        System.out.println(a);

    }//E remove(int index), return removed element

    public static void removeAll() {

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

    }// removeAll(Collection<?> c), Removes from this list all of its elements that are contained

    public static void removeIf() { // boolean removeIf(Predicate<? super E> filter)
        // Removes all of the elements of this collection that satisfy the given predicate
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(22);
        list1.add(33);

        list1.removeIf(t -> t % 2 == 0);
        System.out.println(list1);

    }

    public static void set() {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(3);
        list1.set(0, 99);
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0");
        list2.add("1");
        list2.add("2");
        System.out.println(list2.set(list2.indexOf("0"), "33"));// returns removed element
        System.out.println(list2);

    }// set(int index, E element), Replaces the element at the specified position in this list with, the element previously at the specified position

    public static void set_withoutSet() {// Example: remove 5, add 9 in index of 5.

        // Change name of the any integer
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(3);
        int indx1 = list1.indexOf(5);
        list1.remove(0);
        list1.add(indx1, 9);
        System.out.println(list1);

        // Change name of the any String
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("0");
        list2.add("1");
        list2.add("2");
        int idx = list2.indexOf("1");
        list2.remove("1");
        list2.add(idx, "99");
        System.out.println(list2);

    }

    public static void sort() { // sort(List<T> list), Sorts the specified list into ascending order

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);
    }

    public static void subList() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(22);
        list1.add(33);

        System.out.println(list1.subList(1, 2));

    }// List<E> subList(int fromIndex, int toIndex);  Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive

    public static void toArray() {// Convert List to Array, not used often.
        List<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(22);
        list1.add(33);
        System.out.println(list1);

        System.out.println(list1.toArray());// Object references is created, Object;@5d22bbb7

        Object[] arrayFromList1 = list1.toArray();

        System.out.println(Arrays.toString(arrayFromList1));// print Arrays
    }

}//Object[] toArray();  Returns an array containing all of the elements in this list in proper sequence
