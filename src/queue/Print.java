package queue;

import java.util.*;

class PrintJob {
    int id;
    int priority;

    public PrintJob(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "JobID: " + id + ", Priority: " + priority;
    }
}

public class Print {
    public static void main(String[] args) {
        Queue<PrintJob> printerQueue = new PriorityQueue<>(
                (a, b) -> b.priority - a.priority
        );

        printerQueue.add(new PrintJob(1, 2));
        printerQueue.add(new PrintJob(2, 1));
        printerQueue.add(new PrintJob(3, 3));
        printerQueue.add(new PrintJob(4, 2));

        System.out.println("Printing order:");
        while (!printerQueue.isEmpty()) {
            PrintJob job = printerQueue.poll(); // fetch and remove highest priority
            System.out.println("Printing -> " + job);
        }
    }
}
