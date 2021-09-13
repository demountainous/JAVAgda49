package podstawy.klasy_zadania;

import java.util.Scanner;

public class LockMain {

    /**
     * 10. Zapytajmy użytkownika o kombinację otwierającą zamek. Następnie, tworzymy zamek i dopóki utworzony zamek będzie zamknięty, pytamy użytkownika o to, którą przekładnię przełożyć.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kombinacje 3 cyfr do zamkna");
        String kombinacja = scanner.next();
        Lock lock = new Lock(toArray(kombinacja));
        lock.wypiszKodZamka();
        do {
            System.out.println("Wpisz 1, aby przesunąć pierwsza cyfrę o 1.");
            System.out.println("Wpisz 2, aby przesunąć pierwsza cyfrę o 1.");
            System.out.println("Wpisz 3, aby przesunąć pierwsza cyfrę o 1.");
            int przekładnia = scanner.nextInt();
            if (przekładnia == 1) {
                lock.przekładnia1();
            } else if (przekładnia == 2) {
                lock.przekładnia2();
            } else if (przekładnia == 3) {
                lock.przekładnia3();
            } else {
                System.out.println("Przepraszamy wybrana opcja nie istnieje.");
            }
            lock.wypiszAktualnaKombinacjeZamka();
        } while (!lock.czyZamekJestOtwarty());

        System.out.println("Zamek został otworzony.");
    }

    private static int[] toArray(String kodZamka) {
        int[] kod = new int[3];
        kod[0] = kodZamka.charAt(0) - 48;
        kod[1] = kodZamka.charAt(1) - 48;
        kod[2] = kodZamka.charAt(2) - 48;
        return kod;
    }
}
