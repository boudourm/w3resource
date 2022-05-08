package exercises.exercise47;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise47 {

    public static void main(String[] args) {
        System.out.print("Now: " +
                DateTimeFormatter.ofPattern("yyyy/mm/dd/ hh:mm:ss.SSS")
                        .format(LocalDateTime.now()));
    }
}