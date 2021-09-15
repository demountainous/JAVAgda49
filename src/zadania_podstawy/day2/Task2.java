package zadania_podstawy.day2;

public class Task2 {

    public static void main(String[] args) {
        String input = "programowanie";

        String correctPrefix = "pro";
        String inCorrectPrefix = "pro1";
        System.out.println("Prefix:");
        System.out.format("Input: %s, Prefix: %s\n", input, correctPrefix);
        System.out.println("Result: " + ifWordContainsPrefix(input, correctPrefix));
        System.out.format("Input: %s, Prefix: %s\n", input, inCorrectPrefix);
        System.out.println("Result: " + ifWordContainsPrefix(input, inCorrectPrefix));

        String correctSuffix = "nie";
        String inCorrectSuffix = "nie1";
        System.out.println("\nSuffix:");
        System.out.format("Input: %s, Suffix: %s\n", input, correctSuffix);
        System.out.println("Result: " + ifWordContainsSuffix(input, correctSuffix));
        System.out.format("Input: %s, Suffix: %s\n", input, inCorrectSuffix);
        System.out.println("Result: " + ifWordContainsSuffix(input, inCorrectSuffix));
    }

    private static boolean ifWordContainsPrefix(String input, String prefix) {
        return input.startsWith(prefix);
    }

    private static boolean ifWordContainsSuffix(String input, String suffix) {
        return input.endsWith(suffix);
    }
}
