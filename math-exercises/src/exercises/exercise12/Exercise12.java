package exercises.exercise12;

import java.util.Scanner;

public class Exercise12 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input an integer: ");
        int integer = input.nextInt();
        int primes = 0;
        for (int i = 2; i <= integer; i++) {
            if (isPrime(i))
                primes++;
        }
        System.out.print("The number of prime numbers: " + primes);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}