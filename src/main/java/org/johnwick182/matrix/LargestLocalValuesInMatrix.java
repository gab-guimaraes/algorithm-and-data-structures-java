package org.johnwick182.matrix;

public class LargestLocalValuesInMatrix {
    public int[][] largestLocal(int[][] grid) {
        int[][] local = new int[grid.length -2][grid.length - 2];
        //interate on local matrix to find the max val on interval
        for (int i = 0; i < local.length; i++){
            for (int j = 0; j < local[i].length; j++) {
                local[i][j] = helper(grid, i, j);
            }
        }
        return local;
    }

    public int helper(int[][] grid, int x, int y) {
        int max = 0;
        for (int i = x; i < x + 3; i++) {
            for (int j = y; j < y + 3; j++) {
                max = Math.max(max, grid[i][j]);
            }
        }
        return max;
    }
}
