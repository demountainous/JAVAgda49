package podstawy.klasy2;

public class KlasyPrzyklady2 {
    public static void main(String[] args) {
        Hotel hotelHilton = new Hotel("Hilton");
        System.out.println("Aktualna nazwa hotelu to " + hotelHilton.getName());

        Hotel hotelSheraton = new Hotel();
        hotelSheraton.setName("Sheraton");
        System.out.println("Aktualna nazwa hotelu to " + hotelSheraton.getName());

        Hotel hotelMerton = new Hotel("Merton", 100);
        System.out.println("Aktualna nazwa hotelu to " + hotelMerton.getName());
        System.out.println("Aktualna liczba dostepnych miejsc w hotelu to " + hotelMerton.getIloscDostepnychMiejsc());

        Dog dog = Dog.stworzPsa("Adin");
        System.out.println("Wyswietl imie psa " + dog.getName());

        Cat cat = new Cat("Kociak");
        System.out.println("Nazwa naszego kota to " + cat.getName());

        Cat cat2 = new Cat();
        cat2.setName("Kociak2");
        System.out.println("Nazwa naszego kota to " + cat2.getName());

        System.out.println("Wiek studenta " + Student.wiek);
        Student.wiek = 30;
        System.out.println("Nowy wiek studenta " + Student.wiek);
     }
}
