package podstawy.date_and_time;

import java.time.LocalTime;
import java.util.Random;

public class CzasPrzyklady {

    private static final int PROGNOZOWANY_SREDNI_CZAS_WIZYTY = 10;

    public static void main(String[] args) {
//        LocalTime aktualnyCzas = LocalTime.now();
//        LocalTime ustawiamyGodzinę = LocalTime.now()
//                .withMinute(15)
//                .withSecond(0)
//                .withNano(0);
//        System.out.println(LocalTime.MIDNIGHT);
//        System.out.println("Aktualny czas to " + aktualnyCzas);
//        System.out.println("Wypisz ustawioną godzinę " + ustawiamyGodzinę);
//        System.out.println("Ustawiona godzina po 20 min " + ustawiamyGodzinę.plusMinutes(60));
//        projekcjaGodzinyPrzyjecia(LocalTime.now(), 5);
        wyswietlPrognozowanyCzasy();
    }

    /**
     * Chciałbym, abyście przygotowali metodę. Metoda ta ma realizować
     * wyliczenie prognozowanej godziny przyjęcie w urzędzie.
     * Parametry: aktualna godzinę, ilość osób przed nami w kolejce.
     * Dla uproszczenia zadania przyjmijcie, że każda osoba
     * jest obsługiwana około 10-15 min.
     * Wypiszcie na ekranie, prognozowaną godzinę przyjęcia.
     * W planie najbardziej optymistycznym i pesymistycznym.
     */
    public static void projekcjaGodzinyPrzyjecia(LocalTime godzinaPrzyjscia, int iloscOsobPrzedNami) {
        if (iloscOsobPrzedNami <= 0) {
            System.out.println(godzinaPrzyjscia);
            return;
        }

        System.out.println("Pesymistyczny plan przyjęcia to " + godzinaPrzyjscia.plusMinutes(iloscOsobPrzedNami * 15));
        System.out.println("Optymistyczny plan przyjęcia to " + godzinaPrzyjscia.plusMinutes(iloscOsobPrzedNami * 10));
    }

    public static void wyswietlPrognozowanyCzasy() {
        LocalTime[] tablicaPrzyjec = new LocalTime[5];
        for (int i = 0; i < 5; i++) {
            LocalTime now = LocalTime.now()
                    .withMinute(0)
                    .withSecond(0)
                    .withNano(0);
            tablicaPrzyjec[i] = kalkulacjaCzasuPrzyjecia(now, i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Prognozowana godzina przyjęcia pacjenta nr "
                    + i + " wynosi " + tablicaPrzyjec[i]);
        }
        int numerPacjenta = 1;
        for (int i = 1; i < 5; i++) {
            int realnyCzasWizyty = czasTrwaniaWizyty();
            int wydłużenieWizyty = realnyCzasWizyty -PROGNOZOWANY_SREDNI_CZAS_WIZYTY;
            updatePrognozowanegoCzasuPrzyjecia(tablicaPrzyjec, wydłużenieWizyty, numerPacjenta);
            System.out.println("Wizyta dla pacjenta nr " + (numerPacjenta -1) +
                    " trwała " + realnyCzasWizyty + " minut. Wizyta wydłużyła się o " + wydłużenieWizyty);
            System.out.println("Pacjent numer " + i + " powinien przyjść o " + tablicaPrzyjec[i]);
            wyswietlRealnaGodzinyWizyty(tablicaPrzyjec);
            numerPacjenta++;
        }
    }

    private static void wyswietlRealnaGodzinyWizyty(LocalTime[] prognozowaneGodzinyPrzyjec){
        for (int i = 0; i < 5; i++) {
            System.out.println("Realna godzina przyjęcia pacjenta nr "
                    + i + " wynosi " + prognozowaneGodzinyPrzyjec[i]);
        }
    }

    private static LocalTime[] updatePrognozowanegoCzasuPrzyjecia(LocalTime[] prognozowaneGodzinyPrzyjec,
                                                                  int opoznienie,
                                                                  int numerPacjenta){
        for(int i=numerPacjenta; i < 5; i++){
            prognozowaneGodzinyPrzyjec[i] = prognozowaneGodzinyPrzyjec[i].plusMinutes(opoznienie);
        }
        return prognozowaneGodzinyPrzyjec;
    }

    private static int czasTrwaniaWizyty() {
        Random random = new Random();
        return random.nextInt(30) + 5;
    }


    private static LocalTime kalkulacjaCzasuPrzyjecia(LocalTime aktualnyCzas, int iloscOsob) {
        return aktualnyCzas.plusMinutes(iloscOsob * PROGNOZOWANY_SREDNI_CZAS_WIZYTY);
    }
}
