package set;

import java.util.*;

public class FirstNonDup {
    public static Integer findFirstNonDuplicate(List<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer num : list) {
            set.add(num);
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (Integer num : set) {
            if (countMap.get(num) == 1) {
                return num;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 5, 6, 4, 7, 8, 5);
        System.out.println("First Non-Duplicate: " + findFirstNonDuplicate(numbers));
    }
}

