package podstawy.string_char;

public class StringPrzyklady {

    public static void main(String[] args) {
        sprawdzCzyTekstJedenZnajdujeSieWDrugim("aaabbbbccd", "aac");
    }

    /**
     * 1. Zadeklaruj zmienną typu tekstowego - przypisz jej wartość tekstową (na który składa się co najmniej 5 znaków). Wypisz w konsoli kolejno:
     * - jego długość
     * - wartość jego pierwszego znaku
     * - wartość jego 4 znaku
     * - indeks jego ostatniego znaku.
     */
    private static void analizaTekstu(String tekst) {
        if (tekst.length() < 5) {
            System.out.println("Tekst jest za krótki.");
        }
        System.out.println("Długość tekstu to " + tekst.length());
        System.out.println("Pierwszy znak tekstu to " + tekst.charAt(0));
        System.out.println("Czwarty znak tekstu to " + tekst.charAt(3));
        System.out.println("Indeks ostatniego znaku to " + tekst.lastIndexOf(tekst.charAt(tekst.length() - 1)));
    }

    /**
     * 2. Wypisz wszystkie litery angielskiego alfabetu - (podpowiedź: użyj pętli z licznikiem typu char - pamiętaj, że znaki to liczby! Jako wartość początkową użyj pierwszej litery alfabetu, a w warunku kontynuacji pętli użyj ostatniej litery alfebetu)
     */
    private static void wypiszWszystkieLiteryAlfabetu() {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i);
        }
        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char) i);
        }
    }

    /**
     * 3. Wypisz co drugi znak angielskiego alfabetu.
     */
    private static void wypiszCoDrugaLiteraAlfabetu() {
        for (int i = 'A'; i <= 'Z'; i = i + 2) {
            System.out.println((char) i);
        }
        for (int i = 'a'; i <= 'z'; i = i + 2) {
            System.out.println((char) i);
        }
    }

    /**
     * 4. Wypisz znaki angielskiego alfabetu na wspak.
     */
    private static void wypiszWszystkieLiteryAlfabetuNaWspak() {
        for (int i = 'Z'; i >= 'A'; i--) {
            System.out.println((char) i);
        }
        for (int i = 'z'; i >= 'a'; i--) {
            System.out.println((char) i);
        }
    }

    /**
     * 5. Zadeklaruj zmienną tekstową i przypisz jej wartość. Wypisz wszystkie znaki wartości tej zmiennej w osobnych wierszach.
     */
    private static void wypiszCałyTekst(String tekst) {
        for (int i = 0; i < tekst.length(); i++) {
            System.out.println(tekst.charAt(i));
        }
    }

    /**
     * 6. Zadeklaruj zmienną tekstową i przypisz jej wartość. Podaj liczbę wystąpień litery "a" w tekście przypisanym do zmiennej.
     * liczbaWystąpieńZnaku("jakis tekst", 'a')
     */
    private static int liczbaWystąpieńZnaku(String tekst, char znak) {
        int counter = 0;
        for (int i = 0; i < tekst.length(); i++) {
            if (tekst.charAt(i) == znak)
                counter++;
        }
//        System.out.println("Liczba wystąpień liczby \'a\' w tekście to " + counter);
        return counter;
    }

    /**
     * 7. Znajdź największą literę (leksykograficznie) w tekście przypisanym do zmiennej (największą literą w tekście "jakis tekst" jest 't').
     */
    private static void znajdzNajwiekszaLiteraLeksykograficznie(String tekst) {
        char litera = tekst.charAt(0);
        for (int i = 1; i < tekst.length(); i++) {
            if (tekst.charAt(i) >= litera)
                litera = tekst.charAt(i);
        }
        System.out.println("Największa litera leksykograficznie w tekście to " + litera);
    }

    /**
     * 8. Sprawdź, czy tekst jest palindromem (czy czytany od tyłu będzie taki sam).
     */
    private static void sprawdzCzyJestPalindromem(String tekst) {
        if (czyTekstJestPalindromem(tekst)) {
            System.out.println("Tekst jest palindromem");
        } else {
            System.out.println("Tekst nie jest palindromem");
        }
    }

    private static boolean czyTekstJestPalindromem(String tekst) {
        int indeksKolejnegoZnaku = 0;
        for (int i = tekst.length() - 1; i >= 0; i--) {

            if (tekst.charAt(i) != tekst.charAt(indeksKolejnegoZnaku))
                return false;

            indeksKolejnegoZnaku++;
        }
        return true;
    }

    /**
     * 9. Sprawdź dla wybranego tekstu, dla której litery będziemy mieli najdłuższy ciąg wystąpień tylko tej litery. Przykładowo: aabbbccbb - dla tego tekstu będzie to b, które wystąpiło pod rząd 3 razy.
     */
    private static void liczbaWystąpieńDanejLiteryWTekście(String tekst) {
        char znak = tekst.charAt(0);
        int największaLiczbaWystąpień = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            if (liczbaWystąpieńZnaku(tekst, (char) i) > największaLiczbaWystąpień) {
                znak = (char) i;
                największaLiczbaWystąpień = liczbaWystąpieńZnaku(tekst, (char) i);
            }
        }
        System.out.println("Największa liczba wystąpień znaku " + znak + " w tekście to " + największaLiczbaWystąpień);
    }

    /**
     * 10. Zadeklaruj i przypisz wartości dwóm zmiennym tekstowym. Następnie sprawdź, czy pierwszy tekst zawiera drugi.
     */
    private static void sprawdzCzyTekstJedenZnajdujeSieWDrugim(String tekst1, String tekst2) {
        boolean czyZnajdujeSieJedenTekstWDrugim = tekst1.length() > tekst2.length() ? tekst1.contains(tekst2) : tekst2.contains(tekst1);
        if (czyZnajdujeSieJedenTekstWDrugim) {
            System.out.println("Jeden tekst znajduje się w drugim.");
        } else {
            System.out.println("Jeden tekst nie znajduje się w drugim.");
        }

    }

}
