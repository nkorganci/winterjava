package day33collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Collections {

    public static void main(String[] args) {
        Queue<String> q1 = new PriorityQueue<>();
        q1.add("a");
        q1.add("b");
        q1.add("c");

        System.out.println(q1);


        System.out.println(q1.element()); //
        System.out.println(q1.peek());
        System.out.println(q1.poll());
        System.out.println(q1);

        Deque<String> dq1 = new LinkedList<>();

    }

}
