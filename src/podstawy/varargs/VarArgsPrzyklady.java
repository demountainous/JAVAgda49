package podstawy.varargs;

import podstawy.klasy.Samochod;
import podstawy.varargs.model.Car;
import podstawy.varargs.model.Kolor;
import podstawy.varargs.model.TypSilnika;

import java.util.Arrays;

public class VarArgsPrzyklady {

    /**
     * To chcemy osiągnąć suma(1,2,3,4) lub suma(2,5)
     */

    public static int suma(int... liczby) {
        int wynik = 0;
        for (int liczba : liczby) {
            wynik += liczba;
        }
        return wynik;
    }

    /**
     * 1. Chcemy wypisać na ekranie dowolną liczbę imion -> wypiszImiona(Piotr, Jerzy) lub wypiszImiona(Adam, Piotr, Sylwia, Tadeusz)
     */
    public static void wypiszImiona(String... imiona) {
        for (String imie : imiona) {
            System.out.println(imie);
        }
    }

    /**
     * 2. Stworzcie klasę samochód i dodajcie do niej pola(model, marka, silnik, typSilnika, kolor). Następnie stwórzcie taką metodę, aby osiągnąć taki rezultat ->
     * a) filtrujSamochodyDlaPodanegoKoloru(Kolor kolor, samochod1, samochod2) lub filtrujSamochodyDlaPodanegoKoloru(Kolor kolor, samochod1, samochod2, samocho3)
     * b) filtrujSamochodyDlaPodanegoTypuSilnika(TypSilnika typSilnika, samochod1) lub filtrujSamochodyDlaPodanegoTypuSilnika(TypSilnika typSilnika, samochod1, samochod2)
     * TypSilnika -> ENUM (ELEKTRYCZNY, BENZYNOWY, DISIEL, HYBRYDA) -> do tego enuma dodali pole description oraz moc.
     * C) filtrowanie samochodu po marke i modelu.
     * d) Do tworzenia samochodu użyli wzorca projektowego BUILDER.
     */
    public static Car[] filtrujSamochodyDlaPodanegoKoloru(Kolor kolor, Car... cars) {
        Car[] wynik = new Car[cars.length];
        int znalezioneSamochody = 0;
        for (Car car : cars) {
            if (car.getKolor().equals(kolor)) {
                wynik[znalezioneSamochody] = car;
                znalezioneSamochody++;
            }
        }
        return filtrujDoOkreślonejIlość(znalezioneSamochody, wynik);
    }

    public static Car[] filtrujSamochodyDlaPodanegoTypuSilnika(TypSilnika typSilnika, Car... cars) {
        Car[] wynik = new Car[cars.length];
        int znalezioneSamochody = 0;
        for (Car car : cars) {
            if (car.getTypSilnika().equals(typSilnika)) {
                wynik[znalezioneSamochody] = car;
                znalezioneSamochody++;
            }
        }
        return filtrujDoOkreślonejIlość(znalezioneSamochody, wynik);
    }

    public static Car[] filtrujSamochodyPrzezMarkeIModel(String model, String marka, Car... cars) {
        Car[] wynik = new Car[cars.length];
        int znalezioneSamochody = 0;
        for (Car car : cars) {
            if (car.getMarka().equals(marka) && car.getModel().equals(model)) {
                wynik[znalezioneSamochody] = car;
                znalezioneSamochody++;
            }
        }
        return filtrujDoOkreślonejIlość(znalezioneSamochody, wynik);
    }

    private static Car[] filtrujDoOkreślonejIlość(int znalezioneSamochody, Car[] cars) {
        Car[] wynik = new Car[znalezioneSamochody];
        int index = 0;
        for (Car car : cars) {
            if (car != null) {
                wynik[index] = car;
                index++;
            }
        }
        return wynik;
    }

    /**
     * 3. Chciałbym, abyście stworzyli metodę filtrujSłowa(słowo1, słowo2, słowo3...) zwrócie tylko te słowa, które będą unikatowe!!
     * a) rozszeżyć powyższą metodę o filtrowanie tekstu -> filtruj tekst  w następujący sposób filtruj(String tekst) , dzielicie tekst na zadania, a potem każde zdanie dzielicie na słowa i filtrujecie je w ten sposób, aby każde zdanie miało unikatowe słowa wypiszcie cały tekst na ekranie po działaniach.
     * b) filtruj tekst w taki sposób, aby zwracał tylko zdania pytające.
     * c) Stwórz filter słów, które nie są akceptowalne społecznie zamień je na *****. Wylicz wszystkie nieakceptowalne społecznie słowa w tekście.
     */
    public static String filterTekstuONieakceptowalneSpołecznieSłowa(String tekst, String... nieCenzurowaneSłowa) {
        String[] words = tekst.split("[ ]");
        String wynik = "";
        for (String word : words) {
            if (czyZawieraSłowo(word, nieCenzurowaneSłowa)) {
                wynik= wynik + " " + zamieńSłowaNaGwiazdki(word);
            } else {
                wynik= wynik + " " + word;
            }
        }
        return wynik;
    }

    private static String zamieńSłowaNaGwiazdki(String word) {
        String wynik = "";
        for (int i = 0; i < word.length(); i++) {
            wynik += "*";
        }
        return wynik;
    }

    public static String[] podzielTekstNaUnikatoweSłowa(String tekst) {
        String regex = "[. ?]";
        return unikatoweSłowa(tekst.split(regex));
    }

    public static String[] podzielTekstNaZdaniaPytające(String tekst) {
        String regex = "[?]";
        return tekst.split(regex);
    }

    public static String[] unikatoweSłowa(String... words) {
        String[] wynik = new String[words.length];
        int znalezioneSłowa = 0;
        for (String word : words) {
            if (!word.isBlank() && !czyZawieraSłowo(word, wynik)) {
                wynik[znalezioneSłowa] = word;
                znalezioneSłowa++;
            }
        }
        return filtrujSłowaDoOkreslonejIlości(znalezioneSłowa, wynik);
    }

    private static String[] filtrujSłowaDoOkreslonejIlości(int znalezioneSłowa, String[] words) {
        String[] wynik = new String[znalezioneSłowa];
        int index = 0;
        for (String word : words) {
            if (word != null) {
                wynik[index] = word;
                index++;
            }
        }
        return wynik;
    }

    private static boolean czyZawieraSłowo(String fraze, String[] words) {
        for (String word : words) {
            if (word != null && word.equals(fraze))
                return true;
        }
        return false;
    }


    /**
     * TODO praca domowa
     * 4. Stwórz klasę student(imię, nazwisko, uczelnia, średnia ocen). Chciałbym, abyś dodał 6 studentów. Użyj do tego buildera.
     * a) stwórz filtracjeStudentówPoUczelni(TypUczelni typUczelni, student1, student2...)
     * b) Napisz metodę, która będzie tworzyła ranking uczelni na podstawie najlepszej średniej studentów do najgorszej.
     * c) Do klasy student dodaj, studiowany kierunek. Dodaj filter, który wybierze najlepszych studentów na danym kierunku.
     * d) Dodaj filter dla pracodawcy, który wyszuka najlepszego studenta studiającego dany kierunek.
     */
}
