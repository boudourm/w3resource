package exercises.exercise3;

import java.io.File;
import java.util.Scanner;

public class Exercise3 {
    private static final Scanner input = new Scanner(System.in);
    private static final String OBJECT_PATH = "./input-output-exercises/src/exercises/exercise2";

    public static void main(String[] args) {
        File file = new File(OBJECT_PATH);
        System.out.print("The directory or file does " + (file.exists() ? "" : "not ") + "exist.");
    }
}