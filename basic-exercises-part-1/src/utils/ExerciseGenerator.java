package utils;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ExerciseGenerator {

    public static void main(String[] args) throws IOException {
        File exercises = new File("./basic-exercises-part-1/src/exercises");
        String[] exercisesArray = exercises.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isDirectory();
            }
        });

        List<String> exercisesList = Arrays.asList(exercisesArray);
        int newExerciseOrder = 0;
        for (String exercise : exercisesList) {
            int order = Integer.parseInt(exercise.substring("exercise".length()));
            if (newExerciseOrder <= order)
                newExerciseOrder = order + 1;
        }
        //README.md
        //### [Java Basic: Exercise-37](
        String solution = "https://www.w3resource.com/java-exercises/basic/java-basic-exercise-" + newExerciseOrder + ".php";
        String content = "###[Java Basic: Exercise-" + newExerciseOrder + "](" + solution + ")\n***\n\n***\n" +
                "_Sample output:_\n<pre>\n\n</pre>";
        String url = "./basic-exercises-part-1/src/exercises/exercise" + newExerciseOrder;
        new File(url).mkdirs();
        url += "/README.md";
        Path readme = Paths.get(url);
        Files.writeString(readme, content);

        //Exercisei.java
        content = "package exercises.exercise" + newExerciseOrder + ";\n\n" +
                "import java.util.Scanner;\n\n" +
                "public class Exercise" + newExerciseOrder + " {\n" +
                "private static final Scanner input = new Scanner(System.in);\n\n" +
                "    public static void main(String[] args) {\n\n" +
                "    }\n}";
        url = "./basic-exercises-part-1/src/exercises/exercise" + newExerciseOrder + "/Exercise" + newExerciseOrder + ".java";
        Path exercise = Paths.get(url);
        Files.writeString(exercise, content);
    }

}
