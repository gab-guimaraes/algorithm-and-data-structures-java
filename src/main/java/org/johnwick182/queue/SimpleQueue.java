package org.johnwick182.queue;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");
        while (!queue.isEmpty()) {
            String item = queue.remove();
            System.out.println("reading " + item);
        }
    }
}
