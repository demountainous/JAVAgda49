package zadania_podstawy.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {

    // tak naprawdę możemy użyć tutaj scannera jako pola statycznego
    // dzięki czemu wszystkie metody statyczne w klasie Task4 będą miały do
    // niego dostęp, w naszym wypadku metody getWeightFromUSer oraz getHeightFromUSer
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float weigh = getWeightFromUSer();
        int height = getHeightFromUSer();
        float bmi = calculateBmi(weigh, height);
        displayBmiResult(bmi);
    }

    private static float getWeightFromUSer() {
        float weight = 0;
        try {
            System.out.print("Please insert weight in kg: ");
            weight = scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return weight;
    }

    private static int getHeightFromUSer() {
        int height = 0;
        try {
            System.out.print("Please insert height in cm: ");
            height = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return height;
    }

    private static float calculateBmi(float weight, int height) {
        float heightInMeter = (float) height / 100;
        return weight / (heightInMeter * heightInMeter);
    }

    private static void displayBmiResult(float bmi) {
        if (bmi < 18.5 || bmi > 24.9) {
            System.out.println("BMI is incorrect: " + bmi);
        } else {
            System.out.println("BMI is correct: " + bmi);
        }
    }
}