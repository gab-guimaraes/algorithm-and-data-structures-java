package org.johnwick182.arrays;

import java.util.Arrays;

public class ArrayPrinciples {
    //there are two options to declare arrays in Java

    public static void main(String[] args) {
        String[] movies = new String[3];
        movies[0] = "Harry Potter";
        movies[1] = "Hunger Games";
        movies[2] = "Twilight";
        String series[] = new String[3];
        series[0] = "Lucifer";
        series[1] = "Riverdale";
        series[2] = "Smallville";

        printArrayFor(movies);
        printArrayForeach(series);
        printArraysString(movies);

        int[] smallPrimes = {2, 3, 5, 7, 11, 13};


    }

    public static void printArraysString(String[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void printArrayForeach(String[] array) {
        for (String str : array)
            System.out.println(str);
    }

    public static void printArrayFor(String[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
