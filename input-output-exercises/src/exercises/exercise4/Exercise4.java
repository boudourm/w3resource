package exercises.exercise4;

import java.io.File;
import java.util.Scanner;

public class Exercise4 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises\\exercise4\\Exercise4.java";

    public static void main(String[] args) {
        File object = new File(PATH);
        if (object.canRead())
            System.out.println(object.getName() + " can read");
        if (object.canWrite())
            System.out.println(object.getName() + " can write");
        if (object.canExecute())
            System.out.println(object.getName() + " can execute");
    }
}