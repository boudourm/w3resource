package exercises.exercise5;

import java.io.File;
import java.util.Scanner;

public class Exercise5 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises\\exercise5\\Exercise5.java";

    public static void main(String[] args) {
        File object = new File(PATH);
        if (object.isDirectory())
            System.out.println(object.getName() + " is a directory");
        if (object.isFile())
            System.out.println(object.getName() + " is a file");
    }
}