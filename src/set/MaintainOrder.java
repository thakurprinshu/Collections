package set;

import java.util.*;

public class MaintainOrder {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");
        Set<String> linkedHashSet = new LinkedHashSet<>(items);
        System.out.println("Unique with Insertion Order: " + linkedHashSet);
    }
}

