package exercises.exercise2;

import java.util.Scanner;

public class Exercise2 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input a value for inch : ");
        double inches = input.nextDouble();
        System.out.print(inches + " inch is " + (inches * 0.0254) + " meter");
    }
}