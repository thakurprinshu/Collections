package linkedlists;

import java.util.*;

public class Mergell {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 3, 5, 7));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(2, 4, 6, 8));

        LinkedList<Integer> merged = new LinkedList<>(list1);
        merged.addAll(list2);

        Collections.sort(merged);

        System.out.println("Merged Sorted List: " + merged);
    }
}

