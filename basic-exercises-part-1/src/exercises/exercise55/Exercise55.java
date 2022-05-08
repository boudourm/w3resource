package exercises.exercise55;

import java.util.Scanner;

public class Exercise55 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int hour = 3600;
        int minute = 60;
        System.out.print("Input seconds: ");
        int seconds = input.nextInt();
        System.out.print(seconds / hour + ":" + ((seconds % hour) / minute) + ":" + ((seconds % hour) % minute));
    }
}