package org.johnwick182.arrays;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] numbers = { 3, 5, 7, 1, 0, 3, 5, 7, 3 };
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        //sort numbers internally using the quicksort method tuned
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        //apply binary search
        int result = Arrays.binarySearch(numbers, 99);
        System.out.println(result);
        int[] numbers2 = { 2, 4 };
        int[] numbers3 = { 2, 4 };
        boolean thesame = Arrays.equals(numbers2, numbers3);
        System.out.println(thesame);

    }
}
