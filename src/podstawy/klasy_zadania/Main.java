package podstawy.klasy_zadania;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Exercise1 exercise1 = new Exercise1();
        exercise1.wyswietlKod();

        Exercise2 exercise2 = new Exercise2();
        exercise2.wyświetl();

        Exercise3 exercise3 = new Exercise3();
        exercise3.wyświetlWynik();

        Exercise4 exercise4 = new Exercise4();
        exercise4.wyswietlWynik();

        Exercise5 exercise5 = new Exercise5(10,5);
        exercise5.wyswietlWynik();

        Exercise6 exercise6 = new Exercise6("Cześć", "Piotr");
        exercise6.wyswietlPrzywitanie();

        Exercise7 exercise7 = new Exercise7();
        exercise7.wyswietlWynik();

        CoffeeMaker coffeeMaker =new CoffeeMaker("Eska", 10);
        coffeeMaker.makeCoffee();

        Room room = new Room(20, 3);
        System.out.println("Powierzchnia pokoju wynosi : " + room.getArea());
        System.out.println("Wysokość pokoju wynosi : " + room.getHeight());

        House house = new House("Adress", new Room(20,3), new Room(5, 3), new Room[]{new Room(25,3)});
        System.out.println("Powierzchnia mieszkania wynosi: " + house.getArea());

        //Zadanie z zamkiem
        Lock lock = new Lock(new int[] {3,4,5});
        lock.wypiszAktualnaKombinacjeZamka();
        lock.wypiszKodZamka();
        System.out.println("Czy zamek jest otworozny ? " + lock.czyZamekJestOtwarty());
        lock.wypiszAktualnaKombinacjeZamka();
        lock.wypiszKodZamka();

        Mercedes mercedes = Mercedes.builder()
                .withModel("Model A")
                .build();
        System.out.println(mercedes.getModel());
    }
}
