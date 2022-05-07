package exercises.exercise31;

public class Exercise31 {
    public static void main(String[] args) {
        String[] properties = {"java.version", "java.runtime.version", "java.home", "java.vendor",
                "java.vendor.url", "java.class.path"};
        for (String property : properties) {
            System.out.println(property.replace(".", " ") + ": " +
                    System.getProperty(property));
        }
    }
}