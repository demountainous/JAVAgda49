package podstawy.klasy;


public class KlasyPrzyklady {

    public static void main(String[] args) {
        wyświetlSamochod(stworzSamochod("BIALY"), "BLACK");
        System.out.println("------------------------------------------------");
        Samochod tesla = new Samochod(); //Stworzenie nowego samochodu 2
        String kolorBiały = "BIALY";
        System.out.println("Czy kolor Tesli jest ustawiony na kolor " +kolorBiały +" ?");
        System.out.println("Wyswietl aktualny kolor Tesli " + tesla.getColor());
        System.out.println("Czy wybrany kolor " + kolorBiały  + " jest podstawowy? " + tesla.czyWybranyKolorJestPodstawowy(kolorBiały));
        System.out.println("----------------------------------------------------------------------");
        tesla.setColor(kolorBiały);
        System.out.println("Czy kolor Tesli jest ustawiony na kolor " +kolorBiały +" ?");
        System.out.println("Wyswietl aktualny kolor Tesli " + tesla.getColor());
        System.out.println("Czy wybrany kolor " + kolorBiały  + " jest podstawowy? " + tesla.czyWybranyKolorJestPodstawowy(kolorBiały));
        String nowyKolorTesli = "NIEBIESKI";
        System.out.println("Nowa Tesla.");
        wyświetlSamochod(tesla, nowyKolorTesli);
    }

    private static void wyświetlSamochod(Samochod samochod, String nowyKolor) {
        System.out.println("Podstawowy kolor samochodu to " + samochod.getColor());
        samochod.setColor(nowyKolor);
        System.out.println("Nowy kolor samochodu to " + samochod.getColor());
    }

    private static Samochod stworzSamochod(String kolorPodstawowy){
        Samochod samochod = new Samochod();
        samochod.setColor(kolorPodstawowy);
        return samochod;
    }
}
