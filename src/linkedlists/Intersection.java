package linkedlists;

import java.util.LinkedList;
import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(6);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);

        HashSet<Integer> set = new HashSet<>(list1); // add all elements of list1
        LinkedList<Integer> intersection = new LinkedList<>();

        for (int num : list2) {
            if (set.contains(num)) {
                intersection.add(num);
            }
        }

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Intersection: " + intersection);
    }
}
