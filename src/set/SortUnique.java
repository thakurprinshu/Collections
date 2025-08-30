package set;

import java.util.*;

public class SortUnique {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 2, 9, 1, 2, 9);
        Set<Integer> sortedunique = new TreeSet<>(numbers);
        System.out.println("Sorted Unique: " + sortedunique);
    }
}
