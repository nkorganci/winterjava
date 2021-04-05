package day32collections_v47;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionsQueuePriorityQueueDeque {
    /*
    QUEUE
    1- PriorityQueue puts elements in order which it decides. HashSet is random order.
    2- Queue is an interface, so object can not be created
    3- You can use LinkedList or PriorityQueue.
    4- PriorityQueue is used in FIFO.
     */

    public static void main(String[] args) {
        Queue<String> q1 = new PriorityQueue<>();
        q1.add("a");
        q1.add("b");
        q1.add("c");

        System.out.println(q1);


        System.out.println(q1.element()); // Returns first element,
        System.out.println(q1);
        System.out.println(q1.peek());// returns first element, return null if empty
        System.out.println(q1);
        System.out.println(q1.poll());// cut and paste "a"
        System.out.println(q1);//[b, c]
        System.out.println(q1.peek());//copy and paste
        System.out.println(q1);


    }

    public static void deque1() {
        //Deque: Double ended Queue
        //Can be used for FIFO, LIFO
        Deque<String> dq1 = new LinkedList<>();


    }

}
