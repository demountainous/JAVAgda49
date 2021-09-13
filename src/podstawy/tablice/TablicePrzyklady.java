package podstawy.tablice;

import java.util.Arrays;

public class TablicePrzyklady {

    public static void main(String[] args) {
        wyswietlTabliceInt(new int[]{1, 2, 3, 4, 5});
        System.out.println("Drugi element tablicy " + Arrays.toString(new int[]{1, 2, 3, 4, 5}) + " to " + zwrocDrugiElementTablicy(new int[]{1, 2, 3, 4, 5}));
        wyswietlOdwrotnieTabliceInt(new int[]{1, 2, 3, 4, 5});
        System.out.println("Największy element tablicy " + Arrays.toString(new int[]{23, 500, 130, 4, 34}) + " to " + getMax(new int[]{23, 500, 130, 4, 34}));
        System.out.println("Najmniejszy element tablicy " + Arrays.toString(new int[]{23, 500, 130, 4, 34}) + " to " + getMin(new int[]{23, 500, 130, 4, 34}));
        System.out.println("Suma elementów tablicy " + Arrays.toString(new int[]{23, 500, 130, 4, 34}) + " to " + getSum(new int[]{23, 500, 130, 4, 34}));
        System.out.println("Tablica, której suma elementów jest większa to " + Arrays.toString(getLarger(new int[]{1, 2, 3}, new int[]{1, 5, 6})));
        int[] wynik = getMaxMinAndSum(new int[]{23, 500, 130, 4, 34});
        System.out.println("Dla tablicy " + Arrays.toString(new int[]{23, 500, 130, 4, 34}) + " największy element to " + wynik[0] + " najmniejszy element to " + wynik[1] + " suma tablicy wynosi " + wynik[2]);
        System.out.println("Połączenie tablic " + Arrays.toString(new int[]{23, 500, 130, 4, 34}) + " oraz " + Arrays.toString(new int[]{1, 5, 6}) + " to " + Arrays.toString(getMerge(new int[]{23, 500, 130, 4, 34}, new int[]{1, 5, 6})));
        System.out.println("Tablica bez powtarzających się elementów dla tablicy wejściowej " + Arrays.toString(new int[]{23, 23, 1, 4, 1, 6, 7, 8, 8}) + " to " + Arrays.toString(getDistinct(new int[]{23, 23, 1, 4, 1, 6, 7, 8, 8})));
        System.out.println("Liczba 21 podzielona na liczby pierwsze to " + Arrays.toString(decomposeToPrimeFactors(21)));
    }

    /**
     * 1. Napisz metodę print, która wypisze w konsoli elementy tablicy intów, przekazanej jako parametr.
     */
    private static void wyswietlTabliceInt(int[] liczby) {
        for (int liczba : liczby) {
            System.out.println(liczba);
        }
    }

    /**
     * 2. Napisz metodę getSecondElement, która przyjmuje parametr - tablicę intów, a która zwróci wartość drugiego elementu tej tablicy.
     */
    private static int zwrocDrugiElementTablicy(int[] liczby) {
        if (liczby.length < 2) {
            System.out.println("Error tablica jest za mała");
            return -1;
        } else {
            return liczby[1];
        }
    }

    /**
     * 3. Napisz metodę printReversed, która wypisze w konsoli elementy tablicy intów, przekazanej jako parametr, rozpoczynając od ostatniego elementu.
     */
    private static void wyswietlOdwrotnieTabliceInt(int[] liczby) {
        for (int i = liczby.length - 1; i >= 0; i--) {
            System.out.println(liczby[i]);
        }
    }

    /**
     * 4. Napisz metodę getMax, która przyjmie za parametr tablicę intów, a która zwróci największą wartość z tej tablicy.
     */
    private static int getMax(int[] liczby) {
        int największyElement = Integer.MIN_VALUE;
        for (int liczba : liczby) {
            if (liczba > największyElement) {
                największyElement = liczba;
            }
        }
        return największyElement;
    }

    /**
     * 5. Napisz metodę getMin, która zwróci najmniejszy element przekazanej tablicy intów.
     */
    private static int getMin(int[] liczby) {
        int najmniejszyElement = Integer.MAX_VALUE;
        for (int liczba : liczby) {
            if (liczba < najmniejszyElement) {
                najmniejszyElement = liczba;
            }
        }
        return najmniejszyElement;
    }

    /**
     * 6. Napisz metodę getSum, która przyjmie za parametr tablicę intów, a któa zwróci sumę jej elementów.
     */
    private static int getSum(int[] liczby) {
        int suma = 0;
        for (int liczba : liczby) {
            suma += liczba;
        }
        return suma;
    }

    /**
     * 7. Napisz metodę getLarger, która przyjmie za parametry dwie tablice intów, a która zwróci tę tablicę, której suma elementów jest większa.
     */
    private static int[] getLarger(int[] a, int[] b) {
        return getSum(a) > getSum(b) ? a : b;
    }

    /**
     * 8. Napisz metodę getMaxMinAndSum, która przyjmie za parametr tablicę intów, a która zwróci tablicę trzyelementową, której pierwszy element to wartość największa, drugi to najmniejsza, a trzeci suma wszystkich elementów.
     */
    private static int[] getMaxMinAndSum(int[] liczby) {
        int[] wynik = new int[3];
        wynik[0] = getMax(liczby);
        wynik[1] = getMin(liczby);
        wynik[2] = getSum(liczby);
        return wynik;
    }

    /**
     * 9. Napisz metodę merge, która za parametry dwie tablice intów, a która zwróci tablicę, która zawierać będzie wszystkie elementy z jednej i drugiej tablicy.
     */
    private static int[] getMerge(int[] a, int[] b) {
        int kolejnyIndex = 0;
        int[] wynik = new int[a.length + b.length];
        for (int liczba : a) {
            wynik[kolejnyIndex] = liczba;
            kolejnyIndex++;
        }

        for (int liczba : b) {
            wynik[kolejnyIndex] = liczba;
            kolejnyIndex++;
        }
        return wynik;
    }

    /**
     * 10. Napisz metodę getDistinct, która za parametr przyjmie tablicę, a która zwróci tablicę, w której będą elementy bez powtórzeń z tablicy przekazanej w parametrze.
     */
    private static int[] getDistinct(int[] liczby) {
        int[] wynik = new int[liczby.length];
        int kolejnyIndex = 0;
        for (int liczba : liczby) {
            if (sprawdzCzyLiczbaNieIstniejeWTablicy(wynik, liczba)) {
                wynik[kolejnyIndex] = liczba;
                kolejnyIndex++;
            }
        }
        int ilośćZnalezionychRóżnychElementów = kolejnyIndex;
        return przepiszTabliceDoUstalonegoRozmiaru(wynik, ilośćZnalezionychRóżnychElementów);
    }

    private static int[] przepiszTabliceDoUstalonegoRozmiaru(int[] liczby, int wybranyRozmiar) {
        int[] wynik = new int[wybranyRozmiar];
        for (int i = 0; i < wybranyRozmiar; i++) {
            wynik[i] = liczby[i];
        }
        return wynik;
    }

    private static boolean sprawdzCzyLiczbaNieIstniejeWTablicy(int[] liczby, int szukanaLiczba) {
        for (int liczba : liczby) {
            if (liczba == szukanaLiczba)
                return false;
        }
        return true;
    }

    /**
     * 11. Napisz metodę decomposeToPrimeFactors, która przyjmie jako parametr wartość typu int, a która zwróci tablicę czynników pierwszych argumentu (łącznie z 1, dla wartości większych od zera, łącznie z -1 dla wartości od zera mniejszych).
     */
    private static int[] decomposeToPrimeFactors(int liczba) {
        int[] wynik = new int[1000];
        int liczbaPierwsza = 2;
        int kolejnyIndex = 0;
        while (liczba > 1) {
            while (liczba % liczbaPierwsza == 0)
            {
                wynik[kolejnyIndex] = liczbaPierwsza;
                liczba = liczba / liczbaPierwsza;
                kolejnyIndex++;
            }
            liczbaPierwsza++;
        }
        return przepiszTabliceDoUstalonegoRozmiaru(wynik, kolejnyIndex);
    }
}
