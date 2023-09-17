package exercises.exercise14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise14 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises\\exercise12\\Exercise12.java";

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(PATH)
        );
        String[] lines = bufferedReader.
                lines().toList().
                toArray(new String[(int) bufferedReader.lines().count()]);
        bufferedReader.close();
        System.out.print(Arrays.toString(lines));

    }
}