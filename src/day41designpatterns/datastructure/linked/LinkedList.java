package day41designpatterns.datastructure.linked;

public class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public void createLL(int nodeValue){
        Node newNode = new Node();
        newNode.value= nodeValue;
    }
}
