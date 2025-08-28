package linkedlists;

import java.util.LinkedList;

public class RemNode {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original List: " + list);
        int n = 2;
        removeNthFromEnd(list, n);
        System.out.println("Updated List: " + list);
    }


    public static void removeNthFromEnd(LinkedList<Integer> list, int n) {
        int size = list.size();
        int indexToRemove = size - n;
        if (indexToRemove >= 0 && indexToRemove < size) {
            list.remove(indexToRemove);
        } else {
            System.out.println("Invalid n: " + n);
        }
    }
}
