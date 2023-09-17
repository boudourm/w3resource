package exercises.exercise6;

import java.io.File;
import java.util.Scanner;

public class Exercise6 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises";

    public static void main(String[] args) {
        File root = new File(PATH);
        String[] directories = root.list();
        for (int i = 1; i < directories.length; i++) {
            System.out.println(directories[0] + " & " + directories[i] + " comparison: " + directories[0].compareTo(directories[i]));
        }
    }
}