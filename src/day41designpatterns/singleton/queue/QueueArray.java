package day41designpatterns.singleton.queue;

import java.util.Scanner;

public class QueueArray {
    private int[] qarr;
    private int rear;
    private int front;

    QueueArray() {
        qarr = new int[30];
        front = -1;
        rear = -1;
    }

    QueueArray(int maxSize) {
        qarr = new int[maxSize];
        front = -1;
        rear = -1;
    }

    boolean isEmpty() {
        return (front == -1 || rear == -1);
    }

    boolean isFull() {
        return (rear == qarr[qarr.length - 1]);
    }

    int size() {
        if (isEmpty())
            return 0;
        else
            return (rear - front + 1);
    }

    void insert(int x) {
        if (isFull()) {
            System.out.println("Queue is flow or overflow");
        }

        if (front == -1)
            front = front + 1;
        rear = rear + 1;
        qarr[rear] = x;
    }

    int delete() {
        int k;
        if (isEmpty()) {
            System.out.println("Queu is empty");
            return -1;
        }

        k = qarr[front];
        front = front + 1;
        return k;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty- ");
            return -1;
        }
        return qarr[front];
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        for (int i = front; i < rear; i++) {
            System.out.println(qarr[i]);
        }
    }

}

class QueueArrayMain{

    public static void main(String[] args) {
        int choice, x, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter queue size");
        n= sc.nextInt();
        QueueArray queueArray = new QueueArray(n);

        while (true){
            System.out.println("enter your choice ");
            choice= sc.nextInt();
            if(choice==6)
                break;
            switch (choice){
                case 1:
                    System.out.println("Enter an element to be inserted into a queue: ");
                    x= sc.nextInt();
                    queueArray.insert(x);
                    break;
                case 2: x = queueArray.delete();
                    System.out.println("Deleted element: " + x);
                    break;
            }
        }
    }



}
