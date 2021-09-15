package zadania_podstawy.day2;

public class Task6 {

    public static void main(String[] args) {
        String input = "Ala ma kota";

        char c = 'a';
        System.out.println("Input: " + input);
        System.out.println("Char: " + c);
        System.out.println("Result: " + getIndex(input, c));

        c = 'z';
        System.out.println("\nInput: " + input);
        System.out.println("Char: " + c);
        System.out.println("Result: " + getIndex(input, c));

        input = null;
        System.out.println("\nInput: " + input);
        System.out.println("Char: " + c);
        System.out.println("Result: " + getIndex(input, c));
    }

    private static int getIndex(String input, char sign) {
        if (input != null && !input.isBlank()) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == sign) {
                    return i;
                }
            }
        }
        return -1;
    }
}
