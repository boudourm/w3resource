package exercises.exercise133;

import java.util.Scanner;

public class Exercise133 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] grid = {{131, 673, 234, 103, 18},
                {201, 96, 342, 965, 150},
                {630, 803, 746, 422, 111},
                {537, 699, 497, 121, 956},
                {805, 732, 524, 37, 331}};
        System.out.print("Sum of all numbers along its path : " + findMinimumSumPathFromTopLeftToBottomRightOf(grid, 0, 0));
    }

    private static int findMinimumSumPathFromTopLeftToBottomRightOf(int grid[][], int i, int j) {
        if (i == grid.length - 1 && j == grid[0].length - 1)
            return grid[i][j];
        if (i == grid.length - 1)
            return grid[i][j] + findMinimumSumPathFromTopLeftToBottomRightOf(grid, i, j + 1);
        if (j == grid[0].length - 1)
            return grid[i][j] + findMinimumSumPathFromTopLeftToBottomRightOf(grid, i + 1, j);
        return Math.min(
                grid[i][j] + findMinimumSumPathFromTopLeftToBottomRightOf(grid, i, j + 1),
                grid[i][j] + findMinimumSumPathFromTopLeftToBottomRightOf(grid, i + 1, j)
        );
    }

}