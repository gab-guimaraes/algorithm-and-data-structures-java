package org.johnwick182.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateLeftArray {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        rotateLeft(2, numbers);
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        Collections.rotate(arr, d * -1);
        return arr;
    }
}
