package org.johnwick182.matrix;

public class SumAllElementsMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},{4, 5, 6}};
        System.out.println(sumAllMatrix(matrix));
    }

    public static int sumAllMatrix(int[][] matrix) {
        int sum = 0;

        for (int i = 0; i < matrix.length;i++) {
            for (int j = 0; j < matrix[i].length;  j++) {
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }
}
