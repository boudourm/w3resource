package exercises.exercise17;

import java.util.Scanner;

public class Exercise17 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        float array[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        float average = calculateStreamAverage(array);
    }

    private static float calculateStreamAverage(float[] stream) {
        float average = 0;
        for (int i = 0; i < stream.length; i++) {
            average = (average * i + stream[i]) / (i + 1);
            System.out.println("Average of " + (i + 1) + " numbers is : " + average);
        }
        return average;
    }
}