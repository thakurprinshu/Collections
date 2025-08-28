package arraylist;

import java.util.*;

public class Duplicatescheck {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6, 1));
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : list) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Original List: " + list);
        System.out.println("Duplicates: " + duplicates);
    }
}

