package linkedlists;

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Cycledetect {

    public static boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();

        ListNode current = head;
        while (current != null) {
            if (visited.contains(current)) {
                return true; // cycle detected
            }
            visited.add(current);
            current = current.next;
        }
        return false; // no cycle
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next.next;

        if (hasCycle(head)) {
            System.out.println("Cycle detected in the Linked List.");
        } else {
            System.out.println("No cycle detected.");
        }
    }
}

