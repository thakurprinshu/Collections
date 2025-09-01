package map;

import java.util.HashMap;
import java.util.Map;

public class FreqCounter {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Frequencies: " + freqMap);
    }
}
