package exercises.exercise120;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise120 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input de dimension of the matrix (m,n):");
        System.out.print("Input m: ");
        int m = input.nextInt();
        System.out.print("Input n: ");
        int n = input.nextInt();
        int[][] matrix = buildMatrix(m, n);
        System.out.println("Matrix :");
        printMatrix(matrix);
        System.out.print("Input a value to search in the matrix: ");
        System.out.print(searchValueInMatrix(input.nextInt(), matrix));
    }

    private static int[][] buildMatrix(int m, int n) {
        Random random = new Random();
        int upperBound = m * n;
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = random.nextInt(upperBound);
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }

    private static boolean searchValueInMatrix(int value, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                if (matrix[i][j] == value)
                    return true;
        return false;
    }
}