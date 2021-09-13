package zadaniapodstawy.day1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.print("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        boolean resultPointA = firstDigit > secondDigit;
        System.out.println("If x is greater than y: " + resultPointA);

        boolean resultPointB = firstDigit * 3 > secondDigit;
        System.out.println("If x*3 is greater than y: " + resultPointB);

        boolean resultPointC = (++firstDigit > secondDigit++) && (--firstDigit < secondDigit++) ;
        System.out.println("pointC: " + resultPointC);

        boolean resultPointD =  (firstDigit * secondDigit) % 2 == 0;
        System.out.println("pointD: " + resultPointD);
    }
}
