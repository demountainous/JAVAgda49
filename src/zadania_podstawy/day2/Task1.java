package zadania_podstawy.day2;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(getLastCharacterFromStringV1("domek"));
        System.out.println(getLastCharacterFromStringV2("domek"));
        //System.out.println(getLastCharacterFromStringV1(null));
        //System.out.println(getLastCharacterFromStringV1(" "));
        //System.out.println(getLastCharacterFromStringV1("     "));
        //System.out.println(getLastCharacterFromStringV1("   ala  "));
    }

    private static char getLastCharacterFromStringV1(String input) {
        if (input == null || input.isBlank()) {
            System.exit(-1);
        }
        input = input.trim();
        int lastPosition = input.length() - 1;
        return input.charAt(lastPosition);
    }

    private static String getLastCharacterFromStringV2(String input) {
        if (input == null || input.isBlank()) {
            System.exit(-1);
        }
        input = input.trim();
        int lastPosition = input.length() - 1;
        return input.substring(lastPosition);
    }
}
