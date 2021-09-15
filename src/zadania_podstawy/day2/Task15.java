package zadania_podstawy.day2;

import java.util.Arrays;

public class Task15 {

    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kotaa"};
        System.out.println("Input:");
        System.out.println("firstArray: " + Arrays.toString(firstArray));
        System.out.println("secondArray: " + Arrays.toString(secondArray));
        System.out.println("Result: " + areEqual(firstArray, secondArray));
    }

    private static boolean areEqual(String[] firstArray, String[] secondArray) {
        if (firstArray.length != secondArray.length) {
            return false;
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                if (!firstArray[i].equals(secondArray[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}