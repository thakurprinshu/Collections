package arraylist;

import java.util.*;

public class Intersection {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        ArrayList<Integer> intersection = new ArrayList<>(list1);
        intersection.retainAll(list2);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("Intersection: " + intersection);
    }
}

