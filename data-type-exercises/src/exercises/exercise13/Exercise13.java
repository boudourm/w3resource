package exercises.exercise13;

import java.util.Scanner;

public class Exercise13 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input dividend : ");
        int dividend = input.nextInt();
        System.out.print("Input divisor : ");
        int divisor = input.nextInt();
        System.out.println("Floor division usuing '/' operator : " + (dividend / divisor));
        System.out.println("Floor division using floorDiv() method is : " + (Math.floorDiv(dividend, divisor)) + "\n");
        System.out.println("Floor modulus using '%' operator : " + (dividend % divisor));
        System.out.println("Floor modulus using floorMod() method is : " + Math.floorMod(dividend, divisor));
    }
}