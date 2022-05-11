package exercises.exercise74;

import java.util.Scanner;

public class Exercise74 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] integerArray = {10, -20, 0, 30, 40, 60, 10};
        System.out.print(
                integerArray[0] == 10 ||
                        integerArray[integerArray.length - 1] == 10);
    }
}