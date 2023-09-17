package exercises.exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise8 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Input the investment amount: ");
        double amount = input.nextDouble();
        System.out.print("Input the rate of interest: ");
        double rate = input.nextDouble();
        System.out.print("Input number of years: ");
        int years = input.nextInt();
        System.out.println("Years\tFutureValue");
        List<Double> futureValues = computeFutureYearsInvestmentValues(amount, rate, years);
        for (int i = 0; i < futureValues.size(); i++) {
            System.out.println((i + 1) + "\t\t\t" + futureValues.get(i));
        }
    }


    private static List<Double> computeFutureYearsInvestmentValues(double amount, double rate, int years) {
        List<Double> futureValues = new ArrayList<Double>();
        double lastValue = amount * (1 + rate / 100);
        for (int i = 1; i <= years; i++) {
            futureValues.add(lastValue);
            lastValue = lastValue * (1 + rate / 100);
        }
        return futureValues;
    }
}