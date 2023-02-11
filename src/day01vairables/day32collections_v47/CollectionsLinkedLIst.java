package day01vairables.day32collections_v47;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CollectionsLinkedLIst {

        /*
    1- Collections are  a) List(interface) ==>ArrayList(class),  LinkedList(class)
                           Not: List(interface) can not have constructor
                        b) Queue (interface) ==>PriorityQueue(class),  Deque(interface)
                        c) Set(interface)  ==> hashSet(class), LinkedHashSet(class), SortedSet(Interface), treeSet(class)
                            Note: None of them can have repeated/duplicated elements.
     */

    /*
    LinkedList:    1)It is a class
                   2)It is good/fast at "adding" and "removing" elements
                   3)Every element is connected with another
                   4)Every element has "data" and "pointer" parts
                   5)Elements are called as "node"
                   6)Every linkedlist has "head" (value or data) part, "head" has just "pointer" (address) part
                   7)Last element is called "tail" in linkedlist, it points "null"
                   8)It is not successful in searching elements and updating elements, searching is slow
                   9) ArrayList is successful in searching and updating elements but slow
                   10) ArrayLIst is not good to add/remove elements.
                   11-LinkedList has more methods than Arraylist.
                   12- If you want to use Queue methods for a linked list use "Queue" as data type
                   13- If you want to use List methods for a linked list use "List" as data type
                   14- add(), addAll() common for arrayList() and LinkedList()
     */

    public static void main(String[] args) {

poll();
    }

    public static void add() {
        List<String> ll1 = new LinkedList<>();
        ll1.add("0");//Without index it add the element at the end
        ll1.add(1, "1");
        ll1.add("2");
        ll1.add(0, "3");
        System.out.println(ll1);

        System.out.println(ll1);
    } //  boolean add(E e); ,   void add(int index, E element);

    public static void addAll(){

        LinkedList<Integer> int1 = new LinkedList<>();
        int1.add(1);
        int1.add(2);
        int1.add(3);

        LinkedList<Integer> int2 = new LinkedList<>();
        int1.add(11);
        int1.add(22);
        int1.add(33);

        int1.addAll(int2);// If you want to add multiple elements (collections)
        int1.addAll(1,int2);

        System.out.println(int1);
    }// boolean addAll(int index, Collection<? extends E> c), boolean addAll(Collection<? extends E> c)

    public static void changeMethods() {

        //If you want to use methods of another class use them as data type.
        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Hi");

        List<String> ll2 = new LinkedList<>();
        ll2.add("Bye");

        Queue<String> ll3 = new LinkedList<>();
        ll3.peek();
    }

    public static void addFirst(){
        LinkedList<Integer> int1 = new LinkedList<>();
        int1.add(1);
        int1.add(2);
        int1.add(3);
        System.out.println(int1);

        //addFirst() and add(0,int) methods run same
        int1.addFirst(11);//ArrayList has no this method, this method comes from Queue
        System.out.println(int1);

        //addLast() and add() methods does same thing
        int1.addLast(22);
        System.out.println(int1);
    }//void addFirst(E e), Inserts the specified element at the beginning of this list.

    public static void fifoLifo(){
        /*
        1- FIFO: It stands for First-In-First-Out approach in programming.
            The data structure that implements FIFO is Queue.
            E.g: First person who buys tickets, will enter first.
        2- LIFO: It stands for Last-In-First-Out approach in programming.
            The data structure that implements LIFO is Stack.
            E.g: Balls in a glass, last one go out first.

         */
    }
    public static void elementAndPeak1(){
        LinkedList<Integer> int1 = new LinkedList<>();
        int1.add(1);
        int1.add(2);
        int1.add(3);

        System.out.println(int1);

        //Element and peak methods does same thing, just return types are different.
        System.out.println(int1.element());//Returns first element, it is coming from Queue
                                            //throws NoSuchElementException if the list is empty
        System.out.println(int1.getFirst());// Same with element, returns null if list is empty

        System.out.println(int1.getLast());// Return last elements, return exceptions if empty

        System.out.println(int1.peek());//Returns first element, it is coming from Queue
                                        //Returns "null" if the list is empty

        System.out.println(int1.offer(99));// exactly same with add() method

        System.out.println(int1);

    }
    public static void poll(){
           /*
        Retrieves and removes the head (first element) of this list.
       Returns: the head of this list, or null if this list is empty
         */
        LinkedList<Integer> int1 = new LinkedList<>();
        int1.add(1);
        int1.add(2);
        int1.add(3);
        System.out.println(int1);

        System.out.println(int1.poll());

        System.out.println(int1);

    }
    public static void poll33(){


        LinkedList<Integer> int1 = new LinkedList<>();
        int1.add(1);
        int1.add(2);
        int1.add(3);
        System.out.println(int1);


        System.out.println(int1);

    }//E poll()
    public static void poll1(){
        LinkedList<Integer> int1 = new LinkedList<>();
        int1.add(1);
        int1.add(2);
        int1.add(3);
        System.out.println(int1);


        System.out.println(int1);

    }
    public static void poll2(){
        LinkedList<Integer> int1 = new LinkedList<>();
        int1.add(1);
        int1.add(2);
        int1.add(3);
        System.out.println(int1);


        System.out.println(int1);

    }


}

