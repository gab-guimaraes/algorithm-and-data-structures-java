package org.johnwick182.exercises;

public class NumberOfIslands {

    public static int countIslands(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int totalOfIsland = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //if is island
                if (grid[i][j] == 1) {
                    totalOfIsland++;
                    visitedIsland(grid, i, j);
                }
            }
        }

        return totalOfIsland;
    }

    public static void visitedIsland(int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length)
            return;

        if (grid[row][col] == 0)
            return;

        grid[row][col] = 0;
        visitedIsland(grid, row + 1, col);
        visitedIsland(grid, row -1, col);
        visitedIsland(grid, row, col + 1);
        visitedIsland(grid, row, col - 1);
    }

    public static void main(String[] args) {
        System.out.println(countIslands(
                new int[][] {
                        { 0, 1, 1, 1, 0 },
                        { 0, 0, 0, 1, 1 },
                        { 0, 1, 1, 1, 0 },
                        { 0, 1, 1, 0, 0 },
                        { 0, 0, 0, 0, 0 }
                }));
    }
}
