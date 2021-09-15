package zadania_podstawy.day2;

public class Task5 {
    public static void main(String[] args) {
        String input = "Ala ma kota";

        char c = 'a';
        System.out.println("Input: " + input);
        System.out.println("Char: " + c);
        System.out.println("Result: " + countCharInString(input, c));

        c = 'z';
        System.out.println("\nInput: " + input);
        System.out.println("Char: " + c);
        System.out.println("Result: " + countCharInString(input, c));

        input = null;
        System.out.println("\nInput: " + input);
        System.out.println("Char: " + c);
        System.out.println("Result: " + countCharInString(null, c));

        input = "";
        System.out.println("\nInput: " + input);
        System.out.println("Char: " + c);
        System.out.println("Result: " + countCharInString(null, c));
    }

    private static int countCharInString(String input, char sign) {
        int counter = 0;
        if (input != null && !input.isBlank()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == sign) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static int countCharInStringV2(String input, char sign) {
        int counter = 0;
        char[] letters = input.toCharArray();
        for (char c : letters) {
            if (c == sign) {
                counter++;
            }
        }
        return counter;
    }
}
