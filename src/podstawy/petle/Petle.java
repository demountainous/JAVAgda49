package podstawy.petle;

public class Petle {
    public static void main(String[] args) {
        wypiszNaEkranieIlośćGwiazdRosnąco(5);
//        wypiszNaEkranieTrójkat(5);
    }

    /**
     * 1. Wypisz wszystkie liczby z zakresu 5 - 25.
     */
    private static void wyswietlLiczbyOd5Do25() {
        for (int i = 5; i <= 25; i++) {
            System.out.println("Liczba: " + i);
        }
    }

    /**
     * 2. Wypisz wszystkie liczby z zakresu 55 - 80.
     */
    private static void wyswietlLiczbyOd55Do80() {
        for (int i = 55; i <= 80; i++) {
            System.out.println("Liczba: " + i);
        }
    }

    /**
     * 3. Wypisz wszystkie liczby z zakresu 1 - 100 zaczynając od 100.
     */
    private static void wyswietlLiczbyOd1Do100() {
        for (int i = 100; i > 0; i--) {
            System.out.println("Liczba: " + i);
        }
    }

    /**
     * 4. Wypisz wszystkie liczby parzyste z przedziału 0 - 100.
     */
    private static void wyswietlLiczbyParzysteOd0Do100() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println("Liczba: " + i);
        }
    }

    /**
     * 5. Podaj sumę wszystkich liczb z przedziału 1 - 50 (skorzystaj z pętli for).
     */
    private static int sumaLiczbOd1Do50() {
        int suma = 0;
        for (int i = 1; i <= 50; i++) {
            suma += i;
        }
        System.out.println("Suma liczb od 1 do 50 równa się: " + suma);
        return suma;
    }

    /**
     * 6. Podaj wartość sumy wyrazów ciągu arytmetycznego. Wartość pierwszego wyrazu ciagu to 5, różnica każdych kolejnych dwóch wyrazów to 2. Chcemy zsumować 459 wyrazów (skorzystaj z pętli for).
     */
    private static int sumaWartościCiąguArytmetycznego() {
        int suma = 0;
        int kolejnyWyrazCiagu = 5;
        for (int i = 1; i <= 459; i++) {
            suma = suma + kolejnyWyrazCiagu;
            System.out.println("Dla wyrazu ciągu " + kolejnyWyrazCiagu + " suma wynosi: " + suma);
            kolejnyWyrazCiagu += 2;
        }
        System.out.println("Suma ciągu arytmetycznego wynosi: " + suma);
        return suma;
    }

    /**
     * 7. Dla liczb z przedziału 0 - 100 podaj informację, czy są podzielne przez 2, 3 i 5, w (dokładnie) następujący sposób:
     */
    private static void wyswietlLiczbyPodzielnePrzezDwaOrazTrzyOrazPięćWPrzedzialeOd0Do100() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i + ", podzielne przez 2");
            if (i % 3 == 0)
                System.out.println(i + ", podzielne przez 3");
            if (i % 5 == 0)
                System.out.println(i + ", podzielne przez 5");
            if ((i % 2 != 0) || (i % 3 != 0) || (i % 5 != 0))
                System.out.println(i);
        }
    }

    /**
     * 8. Wypisz w konsoli:
     * *
     * **
     * ***
     * ****
     * *****
     * Wierszy w takim formacie chcemy uzyskać tyle, ile wynosi wartość przypisana zmiennej x.
     */
    private static void wypiszNaEkranieIlośćGwiazdRosnąco(int ilośćGwiazd) {
        for (int i = 1; i <= ilośćGwiazd; i++) {
            System.out.println(stwórzIlośćGwiazd(i, 0));
        }
    }

    /**
     * 9. Wypisz w konsoli:
     * ****
     * ***
     * **
     * *
     */
    private static void wypiszNaEkranieIlośćGwiazdMalejąco(int ilośćGwiazd) {
        for (int i = ilośćGwiazd; i > 0; i--) {
            System.out.println(stwórzIlośćGwiazd(i, 0));
        }
    }

    /**
     * 10. Podobnie jak poprzednie ale chcemy uzyskać trójkąt z kątem prostokątnym w górnym, prawym rogu:
     ****
     ***
     **
     *
     *
     */
    private static void wypiszNaEkranieTrójkat(int ilośćGwiazd) {
        int ilośćSpacji = 0;
        for (int i = ilośćGwiazd; i > 0; i--) {
            System.out.println(stwórzIlośćGwiazd(i, ilośćSpacji));
            ilośćSpacji++;
        }
    }

    private static String stwórzIlośćGwiazd(int ilośćGwiazd, int ilośćSpacji){
        StringBuilder gwiazdy = new StringBuilder();
        gwiazdy.append(" ".repeat(Math.max(0, ilośćSpacji)));
        gwiazdy.append("*".repeat(Math.max(0, ilośćGwiazd)));
        return gwiazdy.toString();
    }
}
