package org.johnwick182.queue;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueImpl {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("gabriel"); //O(log n)
        pq.add("veronica");
        pq.add("lucifer");
        pq.add("amenagiel");
        while (!pq.isEmpty()) {
            System.out.println(pq.remove()); //o(1)
        }
    }
}
