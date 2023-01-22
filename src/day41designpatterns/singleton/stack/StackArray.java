package day41designpatterns.singleton.stack;

import java.util.ArrayList;

public class StackArray {

    private int[] sarr;
    private int top;

    StackArray() { // If we would like to give custom size
        sarr = new int[30];
        top = -1;
    }

    StackArray(int maxSize) { // Client can decide size
        sarr = new int[maxSize];
        top = -1;
    }

    int size() {
        return top + 1;
    }

    boolean isEmpty() {
        return (top == -1);
    }

    boolean isFull() {
        return (top == sarr.length - 1);
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full or overflow");
            return;
        }

        top = top + 1;
        sarr[top] = x;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty ");
            return 0;
        }

        int x = sarr[top];
        top = top - 1;
        return x;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println(" Stack is empty");
            return 0;
        }
        return sarr[top];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        System.out.println("Stack elements are: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(sarr[i]);
        }
    }

}

class StackArrayMain {

    public static void main(String[] args) {
        int choice = 4;
        int n = 5;
        int x = 3;
        StackArray stackArray = new StackArray(n);

        while (true) {
            if (choice == 6)
                break;
            switch (choice) {
                case 1:
                    System.out.println("Push");
                    stackArray.push(x);
                    break;
                case 2:
                    System.out.println("Pop");
                    stackArray.pop();
                    System.out.println("Popped Element is: " + x);
                    break;
                case 3:
                    System.out.println("Top element: " + stackArray.peek());
                    break;
                case 4:
                    System.out.println("display all elements");
                    stackArray.display();
                    break;
                case 5:
                    System.out.println("Size of Stack: " + stackArray.size());
                default:
                    System.out.println(" Invalid Choice ");

            }
        }


    }

}
