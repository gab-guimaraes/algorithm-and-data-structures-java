package org.johnwick182.exercises;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4 };
        int[] num2 = reverseArray(num, 0, num.length - 1);
        System.out.println(Arrays.toString(num2));
    }

    public static int[] reverseArray(int numbers[], int start, int end) {
        while (start < end) {
            //start -> end
            //end -> start
            int aux = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = aux;
            start++;
            end--;
        }
        return numbers;
    }
}
