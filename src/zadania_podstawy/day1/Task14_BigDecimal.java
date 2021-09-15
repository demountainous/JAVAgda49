package zadania_podstawy.day1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task14_BigDecimal {
    private static Scanner input;
    private static final BigDecimal DEFAULT_AMOUNT = new BigDecimal(5_000);
    private static final int DEFAULT_NUMBER_OF_INSTALLMENTS = 36;
    private static final double FIRST_THRESHOLD = 2.5;
    private static final double SECOND_THRESHOLD = 5;
    private static final double THIRD_THRESHOLD = 10;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        BigDecimal amount = setAndVerifyAmount();
        int numberOfInstallments = setAndVerifyNumberOfInstallments();
        BigDecimal singleAmountOfInstallments = getSingleAmountOfInstallments(numberOfInstallments, amount);
        System.out.println("Single instalment: " + singleAmountOfInstallments);
    }

    private static BigDecimal setAndVerifyAmount() {
        System.out.print("Please insert amount: ");
        BigDecimal amount = input.nextBigDecimal();
        if (amount.compareTo(new BigDecimal(100)) == -1) {
            System.out.println("Amount is too small");
            System.exit(1);
        } else if (amount.compareTo(new BigDecimal(10_000)) > 0) {
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
            System.out.printf("Number of installments is too big. Default value %.2 was set", DEFAULT_NUMBER_OF_INSTALLMENTS);
            return DEFAULT_NUMBER_OF_INSTALLMENTS;
        }
        return numberOfInstallments;
    }

    private static BigDecimal getSingleAmountOfInstallments(int numberOfInstallments, BigDecimal amount) {
        BigDecimal singleAmountOfInstallment;
        if (numberOfInstallments >= 6 && numberOfInstallments < 13) {
            singleAmountOfInstallment = calculateTotalAmountWithThreshold(FIRST_THRESHOLD, amount).divide(BigDecimal.valueOf(numberOfInstallments), 2, RoundingMode.HALF_UP);
        } else if (numberOfInstallments >= 13 && numberOfInstallments < 25) {
            singleAmountOfInstallment = calculateTotalAmountWithThreshold(SECOND_THRESHOLD, amount).divide(BigDecimal.valueOf(numberOfInstallments), 2, RoundingMode.HALF_UP);
        } else {
            singleAmountOfInstallment = calculateTotalAmountWithThreshold(THIRD_THRESHOLD, amount).divide(BigDecimal.valueOf(numberOfInstallments), 2, RoundingMode.HALF_UP);
        }
        return singleAmountOfInstallment.setScale(2);
    }

    private static BigDecimal calculateTotalAmountWithThreshold(double currentPercent, BigDecimal amount) {
        return BigDecimal.valueOf((currentPercent / 100) + 1).multiply(amount);
    }
}