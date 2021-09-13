package podstawy.switch_random_while;

import static java.lang.Math.PI;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SwitchRandomWhilePrzyklady {

    public static void main(String[] args) {
//        wyswietlLiczbyDoWybranej();
//        wyświetlPoleProstokąta();
//        petlaPrzyklad();
//        poleFigur();
//        losowanie();
//        System.out.println(Arrays.toString(losowanieLotto()));
        System.out.println(Arrays.toString(losowanieLottoRóżnaWielkośćTablicy()));
        System.out.println("Czy tablica " + Arrays.toString(new int[]{2, 45, 23, 56, 56}) + " zawiera element \'23\' :" + czyTablicaZawieraDanyElement(new int[]{2, 45, 23, 56, 56}, 23));
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5};
        System.out.println("Ile elementów w tablicy b=" + Arrays.toString(b) + " w tablicy a=" + Arrays.toString(a) + " wynosi " + ileElementówZnajdujeWJednejTablicyWDrugiej(a, b));
        losowanieLotto();
    }


    /**
     * 1. Stwórz program, który poprosi użytkownika o podanie wartości liczbowej. Następnie program wypisze wszystkie liczby naturalne, aż do zadanej.
     */
    private static void wyswietlLiczbyDoWybranej() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę naturalną?");
        int liczba = scan.nextInt();
        for (int i = 0; i <= liczba; i++) {
            System.out.println("Liczba: " + i);
        }
    }

    /**
     * 2. Stwórz program, który poprosi użytkownika o podanie dwóch wartości - długości boków prostokąta. Następnie wypisze pole takiego prostokąta.
     */
    private static void wyświetlPoleProstokąta() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok \'a\' prostokąta?");
        int a = scan.nextInt();
        System.out.println("Podaj drugi bok \'b\' prostokąta?");
        int b = scan.nextInt();
        int pole = a * b;
        System.out.println("Pole prostokąta dla a=" + a + " oraz b=" + b + " wynosi: " + pole);
    }

    /**
     * 3. Stwórz program, który będzie zadawał użytkownikowi pytanie "Czy chcesz zakończyć działanie programu", póki odpowiada "nie". Wygoogluj frazę "java String compare".
     */
    private static void petlaPrzyklad() {
        String fraza;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Czy chcesz zakończyć działanie programu?");
            fraza = scanner.next();
            if (fraza.equals("nie"))
                System.out.println("java String compare");
        } while (!fraza.equals("tak"));
    }

    /**
     * 4. Stwórz program, który wypisze w konsoli 10 losowych wartości z zakresu 15 - 25.
     */
    private static void randomNumbers() {
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            int wylosowanaLiczba = random.nextInt(10) + 15;
            System.out.println("Losowanie " + i + " liczby wynosi " + wylosowanaLiczba);
        }
    }

    /**
     * 5. Stwórz program, który spyta użytkownika o podanie figury, której pole chce policzyć:
     * kwadratu, prostokąta, koła czy trójkąta. Następnie zgodnie z wyborem zada odpowiednie pytania o wymiary figury i wypisze jej pole oraz obwód.
     * 6. Zmodyfikuj rozwiązanie poprzedniego zadania tak, aby pytanie o figurę było powtarzane, póki użytkownik nie poda zamiast figury "koniec".
     */
    private static void poleFigur() {
        String wybór;
        do {
            System.out.println("Jakiej figury pole chcesz wyliczyć?");
            System.out.println("Wpisz t - jeżeli chcesz policzyć pole i obwód trójkąta");
            System.out.println("Wpisz k - jeżeli chcesz policzyć pole i obwód kwadratu");
            System.out.println("Wpisz p - jeżeli chcesz policzyć pole i obwód prostokąta");
            System.out.println("Wpisz ko - jeżeli chcesz policzyć pole i obwód koła");
            System.out.println("Wpisz koniec - w celu zakończenia działania programu.");
            Scanner scan = new Scanner(System.in);
            wybór = scan.next();
            switch (wybór) {
                case "t":
                    wyliczPoleIObwdówTrójkata();
                    break;
                case "k":
                    wyliczPoleIObwódKwadratu();
                    break;
                case "p":
                    wyliczPoleIObwódProstokąta();
                    break;
                case "ko":
                    wyliczPoleIObwódKoła();
                    break;
                case "koniec":
                    System.out.println("Zakończenie działania programu.");
                    break;
                default:
                    System.out.println("Dana figura nie istnieje, proszę wybrać wybraną z listy.");
            }
            System.out.println("-------------------------------------------------------------------");
        } while (!wybór.equals("koniec"));
    }

    private static void wyliczPoleIObwódKoła() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień r koła: ");
        int r = scanner.nextInt();
        System.out.println("Obwód koła dla r=" + r + " wynosi " + PI * 2 * r);
        System.out.println("Pole koła dla r=" + r + " wynosi " + PI * r * r);
    }

    private static void wyliczPoleIObwódProstokąta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a prostokąta: ");
        int a = scanner.nextInt();
        System.out.println("Podaj bok b prostokąta: ");
        int b = scanner.nextInt();
        System.out.println("Obwód prostokąta dla a=" + a + ",b=" + b + " wynosi " + (2 * a + 2 * b));
        System.out.println("Pole prostokąta dla a=" + a + ",b=" + b + " wynosi " + a * b);
    }

    private static void wyliczPoleIObwódKwadratu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a kwadratu: ");
        int a = scanner.nextInt();
        System.out.println("Obwód kwadratu dla a=" + a + " wynosi " + 4 * a);
        System.out.println("Pole kwadratu dla a=" + a + " wynosi " + a * a);
    }

    private static void wyliczPoleIObwdówTrójkata() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok a trójkąta: ");
        int a = scanner.nextInt();
        System.out.println("Podaj bok b trójkąta: ");
        int b = scanner.nextInt();
        System.out.println("Podaj bok c trójkąta: ");
        int c = scanner.nextInt();
        int obwód = a + b + c;
        int p = obwód / 2;
        double pole = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
        System.out.println("Obwód trójkąta dla a=" + a + ",b=" + b + ",c=" + c + " wynosi " + obwód);
        System.out.println("Pole trójkąta dla a=" + a + ",b=" + b + ",c=" + c + " wynosi " + pole);
    }

    /**
     * 7.1 Stwórz metodę, która zada użytkownikowi 6 pytań o liczbę skreślaną na kuponie. Wartości podawane przez użytkownika będą kolejnymi elementami tablicy, którą metoda zwróci.
     */
    private static int[] wykreślenieLiczb() {
        int[] wynik = new int[6];
        int index = 0;
        while (index != 6) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj następną liczbę z zakresu 1-49: ");
            int wybranaLiczba = scanner.nextInt();

            if (wybranaLiczba > 0 && wybranaLiczba < 50 && !czyTablicaZawieraDanyElement(wynik, wybranaLiczba)) {
                wynik[index] = wybranaLiczba;
                index++;
            }
            System.out.println("Aktualnie wykreślone liczby to " + Arrays.toString(wynik));
        }
        System.out.println("Wybrane liczby to: " + Arrays.toString(wynik));
        return wynik;
    }

    /**
     * 7.2 Stwórz metodę, która zwraca tablicę sześcioelementową - wynik losowania lotto (wartości 1 - 49).
     */
    private static int[] losowanieLiczb() {
        int[] wynik = new int[6];
        int index = 0;
        while (index != 6) {
            Random random = new Random();
            int wylosowanaLiczna = random.nextInt(48) + 1;
            if (!czyTablicaZawieraDanyElement(wynik, wylosowanaLiczna)) {
                wynik[index] = wylosowanaLiczna;
                index++;
            }
        }
        return wynik;
    }

    /**
     * 7.3 Metodę losującą zmodyfikuj tak, aby zwracała tablicę o różnych rozmiarach.
     */
    private static int[] losowanieLottoRóżnaWielkośćTablicy() {
        Random random = new Random();
        int wielkośćTablicy = random.nextInt(20);//wielkość tablicy od 0-21
        int[] wynik = new int[wielkośćTablicy];
        int index = 0;
        while (index != wielkośćTablicy) {
            int wylosowanaLiczna = random.nextInt(48) + 1;
            if (!czyTablicaZawieraDanyElement(wynik, wylosowanaLiczna)) {
                wynik[index] = wylosowanaLiczna;
                index++;
            }
        }
        return wynik;
    }

    /**
     * 7.4 Stwórz metodę sprawdzającą, czy tablica intów zawiera zadany element.
     */
    private static boolean czyTablicaZawieraDanyElement(int[] tablica, int element) {
        for (int liczba : tablica) {
            if (liczba == element)
                return true;
        }
        return false;
    }

    /**
     * 7.5 Stwórz metodę zwracającą, ile elementów jednej tablicy znajduje się w drugiej.
     */
    private static int ileElementówZnajdujeWJednejTablicyWDrugiej(int[] a, int[] b) {
        int counter = 0;
        for (int liczba : b) {
            for (int i = 0; i < a.length; i++) {
                if (liczba == a[i])
                    counter++;
            }
        }
        return counter;
    }

    /**
     * 7.6 Użyj kolejno stworzonych metod, aby zasymulować losowanie lotto - użytkownik dostanie odpowiedź - ile liczb poprawnie "skreślił".
     */
    private static void losowanieLotto() {
        int[] listaSkreślonychLiczb = wykreślenieLiczb();
        int[] wylosowaneLiczby = losowanieLottoRóżnaWielkośćTablicy();
        System.out.println("Wylosowane liczby to :" + Arrays.toString(wylosowaneLiczby));
        int liczbaTrafionychLiczbWLosowaniu = ileElementówZnajdujeWJednejTablicyWDrugiej(wylosowaneLiczby, listaSkreślonychLiczb);
        System.out.println("Liczba trafionych liczb to: " + liczbaTrafionychLiczbWLosowaniu);
    }
}
