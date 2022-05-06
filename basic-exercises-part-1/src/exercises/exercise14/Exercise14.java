package exercises.exercise14;

public class Exercise14 {
    public static void main(String[] args) {
        String sixStarsLine = "* * * * * * ==================================";
        String fiveStarsLine = " * * * * *  ==================================";
        String fullLine = "==============================================";
        String americanFlag = sixStarsLine + "\n";
        for (int i = 2; i <= 9; i += 2) {
            americanFlag += fiveStarsLine + "\n" + sixStarsLine + "\n";
        }
        for (int i = 10; i <= 15; i++) {
            americanFlag += fullLine + "\n";
        }
        System.out.print(americanFlag);
    }
}