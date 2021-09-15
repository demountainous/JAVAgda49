package zadania_podstawy.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    //private static final float PI = 3.14F;
    private static final float PI = (float) Math.PI;

    public static void main(String[] args) {
        float radius = getDiameterFromUser() / 2;
        float circumferenceOfACircle = calculateCircumferenceOfACircle(radius);
        float areaOfACircle = calculateAreaOfACircle(radius);

        System.out.println("Circumference Of A Circle: " + circumferenceOfACircle);
        System.out.printf("Circumference Of A Circle: %.2f \n", circumferenceOfACircle);
        System.out.format("Circumference Of A Circle: %.2f \n", circumferenceOfACircle);

        System.out.println("Area Of A Circle: " + areaOfACircle);
        System.out.printf("Area Of A Circle: %.2f \n", areaOfACircle);
        System.out.format("Area Of A Circle: %.2f \n", areaOfACircle);
    }

    private static float calculateAreaOfACircle(float radius) {
        // pi *r^2
        return PI * radius * radius;
    }

    private static float calculateCircumferenceOfACircle(float radius) {
        // 2 * pi * r
        return 2 * PI * radius;
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        float diameter = 0;
        try {
            System.out.print("Please insert diameter: ");
            diameter = scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Please insert only digits!");
            System.exit(1);
        }
        return diameter;
    }
}
