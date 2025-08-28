package arraylist;

import java.util.*;

public class Sortlist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        System.out.println("Original List: " + list);
        Collections.sort(list);

        System.out.println("Sorted List (Ascending): " + list);
    }
}

