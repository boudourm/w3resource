package exercises.exercise57;

import java.util.Scanner;

public class Exercise57 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input an integer: ");
        int factors = 0, integer = input.nextInt();
        switch (integer) {
            case 0:
                System.out.print("infinity");
                return;
            case 1:
                System.out.print(1);
                return;
            default:
                if (integer < 0) integer = -integer;
                for (int i = 2; i < integer; i++) {
                    if (integer % i == 0) factors++;
                }
                System.out.print(factors + 2);
        }
    }
}