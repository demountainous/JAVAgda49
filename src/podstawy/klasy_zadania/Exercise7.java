package podstawy.klasy_zadania;

public class Exercise7 {
    private boolean wynik;

    public Exercise7() {
        this.wynik = (3 <= 5) && (10 != 15 || 15 <= 10);
    }

    public void wyswietlWynik(){
        System.out.println("Wynik działania wynosi: " + wynik);
    }
}
