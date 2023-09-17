package exercises.exercise7;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Exercise7 {
    private static final Scanner input = new Scanner(System.in);
    private static final String PATH = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\input-output-exercises\\src\\exercises\\exercise6\\Exercise6.java";

    public static void main(String[] args) {
        File file = new File(PATH);
        System.out.print("The file was last mofified on: " + new Date(file.lastModified()));
    }
}