package exercises.exercise105;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise105 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = {11, 15, 13, 10, 45, 20, 11, 15};
        System.out.println("Array : " + Arrays.toString(array));
        int groupSize = 2;
        int back = 0, front = array.length - groupSize;
        while (groupSize > 0) {
            if (array[back] == array[front]) {
                back++;
                front++;
                groupSize--;
            } else {
                System.out.print(false);
                return;
            }
        }
        System.out.print(true);
    }
}