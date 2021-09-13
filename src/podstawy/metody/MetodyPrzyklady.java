package podstawy.metody;

public class MetodyPrzyklady {

    public static void main(String[] args) {
        System.out.println("Wynik mnożenia 2 i 4 to " + exercise1(2, 4));
        System.out.println(exercise2(new char[]{'a', 'v', 'b'}, new char[]{'g', 'd', 'e'}));
        System.out.println("Czy wartość 100 jest dodatnia: " + exercise3(100));
        System.out.println("Który tekst jest dłuższy: " + zwrocWiekszyTekst("Kasia", "Adam"));
        System.out.println("Wynik mnożenia 2 i 4 to: " + mnożenie(2, 4));
        System.out.println("Wynik potęgowania 2 do 4 to: " + potegowanie(2,4));
        System.out.println("Liczba wystąpień \'b\' w tekście \'aaabbbbccdd\' wynosi: " + liczbaWystąpieńZnaku("aaabbbbccdd", 'b'));
        System.out.println("Wynik mnożenia \'-2\' oraz 4 to: " + mnożenieDlaLiczbUjemnych(-2, 4));
        System.out.println("Czy tekst\"Ala ma kota\" zawiera się w tekście \"Ala ma kota w domu.\" : " +czyPierwszyTekstZawieraSieWDrugimTekscie("Ala ma kota", "Ala ma kota w domu."));
        System.out.println("Czy pierwszy tekst zawiera wszystkie znaki drugiego: " + czyJedenLancuchZawieraWszystkieZnakiDrugiego("oko", "Koniowa"));
    }

    /**
     * 1. Stwórz metodę exercise1, która przyjmie dwa parametry typu int, a która zwróci wynik mnożenia tych parametrów.
     */
    private static int exercise1(int a, int b) {
        return a * b;
    }

    /**
     * 2. Stwórz metodę exercise2, która przyjmie dwa łańcuchy znaków jako parametry, a która zwróci ich konkatenację.
     */
    private static char[] exercise2(char[] znaki1, char[] znaki2) {
        char[] znaki3 = new char[znaki1.length + znaki2.length];
        int counter = 0;
        for (char znak : znaki1) {
            znaki3[counter] = znak;
            counter++;
        }
        for (char znak : znaki2) {
            znaki3[counter] = znak;
            counter++;
        }
        return znaki3;
    }

    /**
     * 3. Stwórz metodę exercise3, która przyjmie parametr typu int. Metoda zwróci odpowiedź na pytanie, czy wartość jest dodatnia.
     */
    private static boolean exercise3(int wartość) {
        return wartość > 0;
    }

    /**
     * 4. Stwórz metodę, która przyjmie dwa parametry typu String. Metoda zwróci dłuższy z tych tekstów. Jeśli oba są równej długości, metoda zwróci pierwszy z nich.
     */
    private static String zwrocWiekszyTekst(String tekst1, String tekst2) {
        return tekst1.length() >= tekst2.length() ? tekst1 : tekst2;
    }

    /**
     * 5. Stwórz metodę, która zadziała tak jak w metoda z zadania 1., ale wynik policzy z wykorzystaniem wielokrotnego dodawania. Niech rozwiązanie zadziała dla liczb nieujemnych.
     */
    private static int mnożenie(int a, int b) {
        int wynik = 0;
        for (int i = 1; i <= b; i++) {
            wynik = wynik + a;
        }
        return wynik;
    }

    /**
     * 6. Stwórz metodę, która przyjmie dwa parametry typu int, a która zwróci wynik potęgowania o podstawie i wykładniku takich, jak przekazano.
     */
    private static int potegowanie(int podstawa, int wykładnik){
        int wynik = 1;
        for (int i = 1; i <= wykładnik; i++) {
            wynik = wynik * podstawa;
        }
        return wynik;
    }

    /**
     * 7. Stwórz metodę, która przyjmie jako pierwszy parametr wartość typu String, a jako drugi znak. Metoda zwróci liczbę wystąpień znaku w łańcuchu.
     */
    private static int liczbaWystąpieńZnaku(String tekst, char znak){
        int counter =0;
        for(int i=0; i < tekst.length(); i++){
            if(tekst.charAt(i) == znak)
                counter++;
        }
        return counter;
    }

    /**
     * 8. Popraw działanie metody z zadania 5 tak, aby zadziałała również dla liczb ujemnych.
     */
    private static int mnożenieDlaLiczbUjemnych(int a, int b) {
        int wynik = 0;
        for (int i = 1; i <= Math.abs(b); i++) {
            wynik = wynik + Math.abs(a);
        }
        if((a > 0 && b >0) || (a < 0 && b < 0)){
            return wynik;
        } else {
            return wynik * (-1);
        }
    }

    /**
     * 9. Stwórz metodę, która przyjmuje dwa łańcuchy jako parametry, a która zwraca informację, czy pierwszy łańcuch zawiera drugi.
     */
    private static boolean czyPierwszyTekstZawieraSieWDrugimTekscie(String tekst1, String tekst2){
        return tekst2.contains(tekst1);
    }

    /**
     * 10. Stwórz metodę, która sprawdzi, czy jeden łańcuch znaków zawiera wszystkie znaki z drugiego łańcucha (jeden znak w pierwszym nie może reprezentować więcej niż jednego w drugim).
     */
    private static boolean czyJedenLancuchZawieraWszystkieZnakiDrugiego(String text1, String text2) {
        char[] arrayChars = text2.toCharArray();
        for (char znak : arrayChars) {
            int counter1 = liczbaWystąpieńZnaku(text1, znak);
            int counter2 = liczbaWystąpieńZnaku(text2, znak);
            if (counter1 != counter2) {
                return false;
            }
        }
        return true;

    }
}
