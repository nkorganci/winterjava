package day01vairables.day31interfacecollections_v46;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LIstMethods {
    /*
    1-ListIterator contain all methods of Iterator.
    2- ListIterator has: next(), hasNext(), previous(), hasPrevious(), set(), nextIndex(), remove()
    3- Iterator is only forward direction
    4- ListIterator run in forward and backward directions.
     */


    public static void main(String[] args) {
reverse();
    }
    public static void addAll() {
        //

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");

        System.out.println(list);
        list.addAll(list1);
        list.addAll(2, list1);
        System.out.println(list);


    }// boolean addAll(int index, Collection<? extends E> c); // boolean addAll(Collection<? extends E> c);

    public static void get1() {
        //Returns the element at the specified position in this list.

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list);


    }// E get(int index);

    public static void listAdd() {
        /*
        1- lists typically allow duplicate elements
        2- lists accept null elements
         */
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");
        list.add("");
        list.add(" ");
        System.out.println(list.add("D"));
        System.out.println(list);

        list.add(1, "Insert");
        System.out.println(list);


    }// boolean add(E e); Appends the specified element to the end of this list

    public static void listAdd1() {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        list.add(1, "Insert");
        System.out.println(list);


    }// void add(int index, E element); Inserts the specified element at the specified position

    public static void remove() {
        //Returns:the element previously at the specified position

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        list.remove(0);
        System.out.println(list.remove(0));
        System.out.println(list);


    }// E remove(int index);

    public static void set01() {
        //Returns: the element previously at the specified position

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        list.set(0, "AA");
        System.out.println(list.set(1, "BB"));
        System.out.println(list);


    }// E set(int index, E element); Replaces the element at the specified position in this list with the specified element

    public static void size1() {
        //

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list);


    }//

    public static void reverse(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);


    }
}
