package day41designpatterns.singleton.recursion.recursionudemy.stack;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
//        boolean result = stack.isEmpty();
//        System.out.println(result);

        stack.push(1);
        stack.push(2);
        stack.push(1);
        stack.push(5);
        int result = stack.pop();
        System.out.println(result);


    }

}

class Stack {

    int[] arr;
    int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with size of: " + size);
    }

    // isEmpty
    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    //isFull
    public boolean isFull() {
        if (topOfStack == arr.length) {
            System.out.println("Stack is full");
            return true;
        } else {
            return false;
        }
    }

    // Push

    public void push(int value) {
        if (isFull()) {
            System.out.println("Full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("Value is: " + value);
        }
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topStack--;
            return topStack;
        }
    }

    //Delete Method
    public void deleteStack(){
        arr=null;
        System.out.println("The stack is deleted ");
    }

}
