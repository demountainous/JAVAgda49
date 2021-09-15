package zadania_podstawy.day2;

public class Task11 {

    public static void main(String[] args) {
        String input = "kajak";
        System.out.println("Input: " + input);
        System.out.println("Result: " + ifPalindrome(input));

        input = "sda";
        System.out.println("\nInput: " + input);
        System.out.println("Result: " + ifPalindrome(input));
    }

    private static boolean ifPalindrome(String inputString) {
        //#1 option
        StringBuilder sbAfterReverse = new StringBuilder(inputString).reverse();
        String stringAfterReverse = sbAfterReverse.toString();
        return stringAfterReverse.equals(inputString);

        //#2 option - ktoś podczas zajęć pytał się o compareTo, które jak sprawdziliśmy
        // zwraca nam wartość int z porówania zamiast boolean'a
        // oczywiście można użyć compareTo tylko trzeba wtedy użyć np operatora trójargumentowego jak poniżej
        /*StringBuilder sbAfterReverse = new StringBuilder(input).reverse();
        return sbAfterReverse.compareTo(new StringBuilder(input)) == 0 ? true : false;*/
    }
}
