package day41datastructurealgorith.linked.linkedudemy;

import java.util.HashSet;

public class Questions {
    void deleteDups(LinkedList1 linkedList1) {
        HashSet<Integer> hs = new HashSet<>();
        Node1 current = linkedList1.head;
        Node1 prev = null;
        while (current != null) {
            int curval = current.value;
            if (hs.contains(curval)) {
                prev.next = current.next;
                linkedList1.size--;
            } else {
                hs.add(curval);
                prev = current;
            }
            current = current.next;
        }
    }
}
