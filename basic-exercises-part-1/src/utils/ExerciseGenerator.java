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
        int newExerciseOrder = Integer.parseInt(exercisesList.get(exercisesList.size() - 1).substring("exercises".length() - 1)) + 1;

        //README.md
        String content = "###[]()\n***\n\n***\n__\n<pre>\n\n</pre>";
        String url = "./basic-exercises-part-1/src/exercises/exercise" + newExerciseOrder;
        new File(url).mkdirs();
        url += "/README.md";
        Path readme = Paths.get(url);
        Files.writeString(readme, content);

        //Exercisei.java
        content = "package exercises.exercise" + newExerciseOrder + ";\n\n" +
                "public class Exercise" + newExerciseOrder + " {\n" +
                "    public static void main(String[] args) {\n\n" +
                "    }\n}";
        url = "./basic-exercises-part-1/src/exercises/exercise" + newExerciseOrder + "/Exercise" + newExerciseOrder + ".java";
        Path exercise = Paths.get(url);
        Files.writeString(exercise, content);
    }

}
