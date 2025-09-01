package map;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 3);
        map.put("Bob", 5);
        map.put("Charlie", 1);
        map.put("David", 4);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        System.out.println("Sorted by Values:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

