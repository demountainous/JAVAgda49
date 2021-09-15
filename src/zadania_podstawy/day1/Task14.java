package zadania_podstawy.day1;

import java.util.Scanner;

public class Task14 {
    private static Scanner input;
    private static final double DEFAULT_AMOUNT = 5_000;
    private static final int DEFAULT_NUMBER_OF_INSTALLMENTS = 36;
    private static final double FIRST_THRESHOLD = 2.5;
    private static final double SECOND_THRESHOLD = 5;
    private static final double THIRD_THRESHOLD = 10;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        double amount = setAndVerifyAmount();
        int numberOfInstallments = setAndVerifyNumberOfInstallments();
        double singleAmountOfInstallments = getSingleAmountOfInstallments(numberOfInstallments, amount);
        System.out.println("Single instalment: " + singleAmountOfInstallments);
    }

    private static double setAndVerifyAmount() {
        System.out.print("Please insert amount: ");
        double amount = input.nextDouble();
        if (amount < 100) {
            System.out.println("Amount is too small");
            System.exit(1);
        } else if (amount > 10_000) {
            System.out.printf("Amount is too big. Default value %.2f was set\n", DEFAULT_AMOUNT);
            return DEFAULT_AMOUNT;
        }
        return amount;
    }

    private static int setAndVerifyNumberOfInstallments() {
        System.out.print("Please insert number of installments: ");
        int numberOfInstallments = input.nextInt();
        if (numberOfInstallments < 6) {
            System.out.println("Number of installments is too small");
            System.exit(1);
        } else if (numberOfInstallments > 48) {
            System.out.printf("Number of installments is too big. Default value %d was set\n", DEFAULT_NUMBER_OF_INSTALLMENTS);
            return DEFAULT_NUMBER_OF_INSTALLMENTS;
        }
        return numberOfInstallments;
    }

    private static double getSingleAmountOfInstallments(int numberOfInstallments, double amount) {
        double singleAmountOfInstallment;
        if (numberOfInstallments >= 6 && numberOfInstallments < 13) {
            singleAmountOfInstallment = calculateTotalAmountWithThreshold(FIRST_THRESHOLD, amount) / numberOfInstallments;
        } else if (numberOfInstallments >= 13 && numberOfInstallments < 25) {
            singleAmountOfInstallment = calculateTotalAmountWithThreshold(SECOND_THRESHOLD, amount) / numberOfInstallments;
        } else {
            singleAmountOfInstallment = calculateTotalAmountWithThreshold(THIRD_THRESHOLD, amount) / numberOfInstallments;
        }
        singleAmountOfInstallment = Math.round(singleAmountOfInstallment * 100);
        return singleAmountOfInstallment / 100;
    }

    private static double calculateTotalAmountWithThreshold(double currentPercent, double amount) {
        return ((currentPercent / 100) + 1) * amount;
    }
}