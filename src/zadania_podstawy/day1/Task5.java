package zadania_podstawy.day1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.print("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        System.out.println("sumOfTheSequenceWhileLoop: " + sumOfTheSequenceWhileLoop(firstDigit, secondDigit));
        System.out.println("sumOfTheSequenceDoWhileLoop: " + sumOfTheSequenceDoWhileLoop(firstDigit, secondDigit));
        System.out.println("sumOfTheSequenceForLoop: " + sumOfTheSequenceForLoop(firstDigit, secondDigit));
    }

    private static int sumOfTheSequenceForLoop(int firstDigit, int secondDigit) {
        int result = 0;
        for (int i = firstDigit; i <= secondDigit; i++) {
            result += i;
        }
        return result;
    }

    private static int sumOfTheSequenceWhileLoop(int firstDigit, int secondDigit) {
        int result = 0;
        while (firstDigit <= secondDigit) {
            result += firstDigit;
            firstDigit++;
        }
        return result;
    }

    private static int sumOfTheSequenceDoWhileLoop(int firstDigit, int secondDigit) {
        int result = 0;
        do {
            result += firstDigit;
            firstDigit++;
        } while (firstDigit <= secondDigit);
        return result;
    }
}
