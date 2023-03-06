package day41datastructurealgorith.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates83 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == currentNode.val) {
                currentNode.next = currentNode.next.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
