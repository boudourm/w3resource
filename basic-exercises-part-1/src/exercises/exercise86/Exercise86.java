package exercises.exercise86;

import java.util.Scanner;

public class Exercise86 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the value of n: ");
        int n = input.nextInt();
        while (n != 1) {
            n = (n % 2 == 0 ? n / 2 : (n / 3 + 1));
            System.out.print(n + ", ");
        }
        System.out.print("\nValue of n = " + n);
/*
Input the value of n:
 9

Value of n = 1
 */
    }
}