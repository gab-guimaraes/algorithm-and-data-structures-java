package org.johnwick182.matrix;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifferenceMatrix {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list3.add(9);
        list3.add(8);
        list3.add(9);
        arr.add(list1);
        arr.add(list2);
        arr.add(list3);
        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumL = 0;
        int sumR = 0;
        int lines = arr.size();

        System.out.println("test 1");
        for (int i = 0; i < lines;i++) {
            System.out.println("reading" + arr.get(i).get(i));
            sumL = sumL + arr.get(i).get(i);
            sumR = sumR + arr.get(i).get(arr.size() - 1 - i);
        }

        return Math.abs(sumL - sumR);
    }
}
