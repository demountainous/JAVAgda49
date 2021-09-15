package zadania_podstawy.day1;

public class Task1 {
    private static final String DECIMAL = "decimal";
    private static final String HEXA = "hexadecimal";
    private static final String BINARY = "binary";

    public static void main(String[] args) {
        displayWord(DECIMAL);
        System.out.println();

        displayWord(HEXA);
        System.out.println();

        displayWord(BINARY);
        System.out.println();

        displayWord("dummy");
    }

    private static void displayWord(String format) {
        switch (format) {
            case DECIMAL:
                displayWordUsingDecimalFormat();
                break;
            case HEXA:
                displayWordUsingHexaFormat();
                break;
            case BINARY:
                displayWordUsingBinaryFormat();
                break;
            default:
                System.out.println("Wrong format!");
        }
    }

    private static void displayWordUsingDecimalFormat() {
        char s = 83;
        char d = 68;
        char a = 65;

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

    private static void displayWordUsingBinaryFormat() {
        char s = 0b01010011;
        char d = 0b01000100;
        char a = 0b01000001;

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }

    private static void displayWordUsingHexaFormat() {
        char s = 0x53;
        char d = 0x44;
        char a = 0x41;

        System.out.print(s);
        System.out.print(d);
        System.out.print(a);
    }
}
