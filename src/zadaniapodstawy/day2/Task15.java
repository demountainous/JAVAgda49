package zadaniapodstawy.day2;

public class Task15 {
    public static void main(String[] args) {
        String[] array1 = {"Ala", "ma", "kota"};
        String[] array2 = {"Ala", "ma", "kotaa"};

        if (array1.length != array2.length) {
            System.out.println("Tablice sa takie same.");
        } else {
            boolean czyRoznicaZnaleziona = false;
        for (int i = 0; i < array1.length; i++) {

            if (array1[i] != array2[i]) {
                czyRoznicaZnaleziona = true;
                break;
            }
        }
            if (czyRoznicaZnaleziona) {
                System.out.println("Tablice nie sa takie same.");
            } else {
                System.out.println("Tablice sa takie same.");
            }
        }
    }
}

//poprawic