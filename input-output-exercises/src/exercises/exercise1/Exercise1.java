package exercises.exercise1;

import java.io.File;
import java.util.Scanner;

public class Exercise1 {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        File file = new File("C:/Users/Y9FVTB706/IdeaProjects/w3resource/basic-exercises-part-1/src/exercises");
        String[] filesAndDirectories = file.list();
        for (String objectName : filesAndDirectories) {
            System.out.println(objectName);
        }
    }
}