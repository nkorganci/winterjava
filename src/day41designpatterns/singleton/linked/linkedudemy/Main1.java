package day41designpatterns.singleton.linked.linkedudemy;

public class Main1 {

    public static void main(String[] args) {
        LinkedList1 ll = new LinkedList1();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.traverseLL();
    }


}

class LinkedList1 {

    public Node1 head;
    public Node1 tail;
    public int size;

    public void createLL(int nodeValue) {
        Node1 newNode1 = new Node1();
        newNode1.value = nodeValue;
        newNode1.next = null;
        head = newNode1;
        tail = newNode1;
        size = 1;
    }

    public void insertNode(int nodeValue) {
        Node1 newNode = new Node1();
        newNode.value = nodeValue;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void traverseLL() {
        Node1 tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print("->");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }


}

class Node1 {

    public int value;
    public Node1 next;
    public Node1 prev;
}
