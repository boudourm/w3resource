package exercises.exercise7;

public enum RomanDigit implements Comparable<RomanDigit> {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private int arabicValue;

    private RomanDigit(int arabicValue) {
        this.arabicValue = arabicValue;
    }

    public int getArabicValue() {
        return this.arabicValue;
    }

}
