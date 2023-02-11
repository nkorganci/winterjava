package day01vairables.day32collections_v47.collectionsAshok;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Stack;

public class A13_PriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(3);
        priorityQueue.add(2);
        priorityQueue.add(5);
        System.out.println(priorityQueue);// [1, 3, 2, 5]
        priorityQueue.remove();
        System.out.println(priorityQueue);// [2, 3, 5] , removed the first one, FIFO

        //Print
        for(Integer num: priorityQueue){
            System.out.println("priority: "+num);
        }

        Iterator<Integer> iterator= priorityQueue.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove or poll do same
        //element or peek do same


        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);// [1, 2, 3]
        stack.pop();
        System.out.println(stack);// [1, 2], removed last one, LIFO
    }
}
