package org.johnwick182.matrix;

import java.util.Arrays;

public class MatrixPrinciples {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,8,3},
                {9,6,4}
        };
//        walkHorizontally(matrix);
//        walkHorizontallyForEach(matrix);
//        printFast(matrix);
        walkVertically(matrix);
    }

    /* this way we read first per line and then per column
     i line, j column */
    public static void walkHorizontally(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("position: [" + i + "," + j + "] value: " + matrix[i][j]);
            }
        }
    }

    /*
    to print vertically I need to fix the column and iterate on lines
     */
   public static void walkVertically(int[][] matrix) {
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++ ) {
                System.out.println("position: [" + i + "," + j + "] value: " + matrix[i][j]);
            }
        }
   }

    public static void walkHorizontallyForEach(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.println(value);
            }
        }
    }

    public static void printFast(int[][] matrix) {
        System.out.println(Arrays.deepToString(matrix));
    }
}
