package exercises.exercise9;

import java.util.Scanner;

public class Exercise9 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input 1st integer: ");
        int firstInteger = input.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInteger = input.nextInt();
        System.out.println("Sum of two integers: " + (firstInteger + secondInteger));
        System.out.println("Difference of two integers: " + (firstInteger - secondInteger));
        System.out.println("Product of two integers: " + (firstInteger * secondInteger));
        System.out.println("Average of two integers: " + (firstInteger + secondInteger) / 2.);
        System.out.println("Distanc of two integers: " + Math.abs(firstInteger - secondInteger));
        System.out.println("Max integer: " + Math.max(firstInteger, secondInteger));
        System.out.print("Min integer: " + Math.min(firstInteger, secondInteger));
/*
Input 1st integer: 25
Input 2nd integer: 5
Sum of two integers: 30
Difference of two integers: 20
Product of two integers: 125
Average of two integers: 15.00
Distance of two integers: 20
Max integer: 25
Min integer: 5
 */
    }
}