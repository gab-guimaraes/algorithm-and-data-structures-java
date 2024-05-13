package org.johnwick182.matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumAllElementsMatrixTest {

    @Test
    public void sumAllMatrix() {
        int[][] matrix = {{4, 5, 3, 2}, {9, 5, 6, 2}, {1, 5, 3, 5}};
        int result = SumAllElementsMatrix.sumAllMatrix(matrix);
        Assertions.assertEquals(result, 50, "Matrix sum should be 50");
    }

    @Test
    public void sumZeroMatrix() {
        int[][] matrix = {{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        int result = SumAllElementsMatrix.sumAllMatrix(matrix);
        Assertions.assertEquals(result,0,"Matrix sum should be 0");
    }
}