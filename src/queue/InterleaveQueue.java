package queue;

import java.util.*;

public class InterleaveQueue {
    public static void interleave(Queue<Integer> q) {
        if (q.size() % 2 != 0) {
            System.out.println("Queue length must be even!");
            return;
        }
        Stack<Integer> stack = new Stack<>();
        int half = q.size() / 2;
        for (int i = 0; i < half; i++) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
        for (int i = 0; i < half; i++) {
            q.offer(q.poll());
        }
        for (int i = 0; i < half; i++) {
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
            q.offer(q.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 8; i++) q.offer(i);

        System.out.println("Original Queue: " + q);
        interleave(q);
        System.out.println("Interleaved Queue: " + q);
    }
}

