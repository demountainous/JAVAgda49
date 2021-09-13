package podstawy.Instrukcja_warunkowa;

import java.util.Arrays;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        najwiekszaLiczbaZCzterech(5, 124, 4, 5);
    }

    /**
     * 1. Zadeklaruj dwie zmienne liczbowe (całkowite) i przypisz im wartości. Następnie wypisz wartość większej z nich. Do sprawdzenia, która jest większa użyj instrukcji warunkowej.
     */
    private static void wyswietlWiekszaLiczbę(int a, int b) {
        int c = a > b ? a : b; //Math.max(a,b) można użyć zamiennie
        System.out.println("Większa liczba to " + c);
    }

    /**
     * 2. Sprawdź, czy wartość przypisana zmiennej jest parzysta, czy nie (wypisz w konsoli odpowiedni komunikat).
     */
    private static boolean czyWartośćJestParzysta(int liczba) {
        boolean parzysta = liczba % 2 == 0;
        if (parzysta) {
            System.out.println("Liczba " + liczba + " jest podzielna przez 2.");
        } else {
            System.out.println("Liczba " + liczba + " nie jest podzielna przez 2.");
        }
        return parzysta;
    }

    /**
     * 3. Zadeklaruj dwie zmienne, jedna reprezentująca temperaturę (liczba całkowita), druga to wartość logiczna reprezentująca to, czy pada deszcz. Przypisz zmiennym wartości. Następnie wypisz w konsoli, czy pogoda jest ładna, czy nie, przy użyciu instrukcji warunkowej. Pogoda jest ładna, gdy temperatura jest większa lub równa 20 i gdy nie pada deszcz.
     */
    private static boolean czyPogodaJestLadna(int temperatura, boolean niepada) {
        boolean pogodaJestLadna = temperatura >= 20 && niepada;
        if (pogodaJestLadna) {
            System.out.println("Pogoda jest ładna");
        } else {
            System.out.println("Pogoda jest brzydka.");
        }
        return pogodaJestLadna;
    }

    /**
     * 4. Sprawdź, czy wartość zmiennej jest większa, mniejsza, czy równa zero (wyszukaj w sieci frazę "java else if").
     */
    private static void sprawdzCzyLiczbaJestWiekszaMniejszaLubRownaZero(int liczba) {
        if (liczba > 0) {
            System.out.println("Liczba większa od zera");
        } else if (liczba < 0) {
            System.out.println("Liczba mniejsza od zera");
        } else {
            System.out.println("Liczba równa się zero.");
        }
    }

    /**
     * 5. Zadeklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości. Następnie wypisz wartość największej z nich.
     */
    private static void najwiekszaLiczbaZTrzech(int a, int b, int c) {
        int[] liczby = {a, b, c};
        int najwiekszaLiczba = znajdzNajwiekszaLiczba(liczby);
        System.out.println("Najwieksza liczba wśród liczb: " + Arrays.toString(liczby) + " to " + najwiekszaLiczba);
    }


    /**
     * 6. Rozwiąż zadanie 1. dla czterech zmiennych.
     */
    private static void najwiekszaLiczbaZCzterech(int a, int b, int c, int d) {
        int[] liczby = {a, b, c, d};
        int najwiekszaLiczba = znajdzNajwiekszaLiczba(liczby);
        System.out.println("Najwieksza liczba wśród liczb: " + Arrays.toString(liczby) + " to " + najwiekszaLiczba);
    }

    private static int znajdzNajwiekszaLiczba(int... liczby) {
        int najwiekszaLiczba = Integer.MIN_VALUE;
        for (int liczba : liczby) {
            if (liczba > najwiekszaLiczba) {
                najwiekszaLiczba = liczba;
            }
        }
        return najwiekszaLiczba;
    }
}
