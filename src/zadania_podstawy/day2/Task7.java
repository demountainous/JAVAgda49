package zadania_podstawy.day2;

public class Task7 {

    private static final char SPACE_SIGN = ' ';

    public static void main(String[] args) {
        String input = "Ala ma kota";
        System.out.println("Input: " + input);
        System.out.println("Result: " + calculateSpacesInString(input));

        input = "Ala";
        System.out.println("\nInput: " + input);
        System.out.println("Result: " + calculateSpacesInString(input));

        input = " ";
        System.out.println("\nInput: " + input);
        System.out.println("Result: " + calculateSpacesInString(input));
    }

    private static double calculateSpacesInString(String input) {
        double spacesCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            // w takim przypadku zamiast ' ' można się zastanowić nad użyciem stałej
            // moim zdaniem poprawia to czytelność, osobiście staram się unikać tzw magic digit lub magic string
            if (input.charAt(i) == SPACE_SIGN) {
                spacesCounter++;
            }
        }
        return (spacesCounter / input.length()) * 100;
    }
}