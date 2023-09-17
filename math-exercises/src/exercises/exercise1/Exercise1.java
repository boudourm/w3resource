package exercises.exercise1;

import java.util.Scanner;

public class Exercise1 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int tot_theory_marks = 350, tot_practical_marks = 90, tot_marks = 500;
        System.out.print("Percentage of marks: " + (tot_theory_marks + tot_practical_marks) * 100 / tot_marks + "%");
    }
}