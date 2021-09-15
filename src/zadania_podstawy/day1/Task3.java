package zadania_podstawy.day1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();

        System.out.print("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        methodForPointA(firstDigit, secondDigit);
        methodForPointB(firstDigit, secondDigit);
        methodForPointC(firstDigit, secondDigit);
        methodForPointD(firstDigit, secondDigit);
    }

    private static void methodForPointA(int firstDigit, int secondDigit) {
        boolean resultPointA = firstDigit > secondDigit;
        System.out.println("If x is greater than y: " + resultPointA);
    }

    private static void methodForPointB(int firstDigit, int secondDigit) {
        boolean resultPointB = firstDigit * 3 > secondDigit;
        System.out.println("If x*3 is greater than y: " + resultPointB);
    }

    private static void methodForPointC(int firstDigit, int secondDigit) {
        boolean resultPointC = (++firstDigit > secondDigit++) && (--firstDigit < secondDigit++);
        System.out.println("pointC: " + resultPointC);
    }

    private static void methodForPointD(int firstDigit, int secondDigit) {
        boolean resultPointD = (firstDigit * secondDigit) % 2 == 0;
        System.out.println("pointD: " + resultPointD);
    }
}
