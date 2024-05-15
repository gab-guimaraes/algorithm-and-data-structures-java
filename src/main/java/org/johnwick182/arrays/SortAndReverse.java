package org.johnwick182.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortAndReverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("gabriel");
        list.add("veronica");
        list.add("amenadiel");
        Collections.sort(list);
        list.forEach(System.out::println);
        Collections.reverse(list);
        list.forEach(System.out::println);

        int[] numbers = { 3, 4, 556, 300, 39, 95 };
        Arrays.sort(numbers);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
