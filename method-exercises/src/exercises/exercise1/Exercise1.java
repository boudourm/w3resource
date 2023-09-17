package exercises.exercise1;

import java.util.Scanner;

public class Exercise1 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Input the first number: ");
        int secondNumber = input.nextInt();
        System.out.print("Input the thrid number: ");
        int thirdNumber = input.nextInt();
        System.out.print("The smallest value is : " + findSmallestAmong(firstNumber, secondNumber, thirdNumber));
    }

    private static int findSmallestAmong(int... number) {
        int temp = Integer.MAX_VALUE;
        for (int integer : number) {
            temp = Math.min(temp, integer);
        }
        return temp;
    }
}