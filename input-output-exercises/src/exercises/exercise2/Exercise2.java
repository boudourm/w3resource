package exercises.exercise2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.Scanner;

public class Exercise2 {
    private static final Scanner input = new Scanner(System.in);

    private static final String DIRECTORY = "C:\\Users\\Y9FVTB706\\IdeaProjects\\w3resource\\basic-exercises-part-1\\src\\exercises\\exercise145";

    public static void main(String[] args) {
        File directory = new File(DIRECTORY);
        for (String object : Objects.requireNonNull(directory.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".md");
            }
        }))) {
            System.out.println(object);
        }
    }
}