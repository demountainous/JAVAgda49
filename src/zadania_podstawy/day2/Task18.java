package zadania_podstawy.day2;

import java.util.Arrays;
import java.util.Random;

public class Task18 {

    public static void main(String[] args) {
        int[] ints = generateArray();
        System.out.println("Input: " + Arrays.toString(ints));
        int[] fun = calculate(ints);
        for (int i = 0; i < fun.length; i++) {
            System.out.println(i + ": " + fun[i]);
        }
    }

    private static int[] generateArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    private static int[] calculate(int[] array) {
        int[] repeats = new int[10];
        for (int i = 0; i < array.length; i++) {
            repeats[array[i]]++;
        }
        return repeats;
    }
}