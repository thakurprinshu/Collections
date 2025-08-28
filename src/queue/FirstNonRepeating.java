package queue;

import java.util.*;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String stream = "aabcbd";
        findFirstNonRepeating(stream);
    }

    public static void findFirstNonRepeating(String stream) {
        Map<Character, Integer> freq = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();
        for (char ch : stream.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            queue.offer(ch);
            while (!queue.isEmpty() && freq.get(queue.peek()) > 1) {
                queue.poll();
            }
            if (queue.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(queue.peek() + " ");
            }
        }
    }
}

