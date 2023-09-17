package exercises.exercise9;

import java.io.File;
import java.util.Scanner;

public class Exercise9 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises\\exercise8\\Exercise8.java";

    public static void main(String[] args) {
        File file = new File(PATH);
        System.out.println(file.length() + " bytes");
        System.out.println(file.length() / Math.pow(2, 10) + " kb");
        System.out.println(file.length() / Math.pow(2, 20) + " mb");
    }
}