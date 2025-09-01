package map;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            anagramMap.putIfAbsent(key, new ArrayList<>());
            anagramMap.get(key).add(word);
        }

        System.out.println("Grouped Anagrams: " + anagramMap.values());
    }
}

