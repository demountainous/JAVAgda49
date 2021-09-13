package podstawy.klasy_zadania;

public class Exercise6 {
    private String przywitanie;
    private String imie;

    public Exercise6(String przywitanie, String imie) {
        this.przywitanie = przywitanie;
        this.imie = imie;
    }

    public void wyswietlPrzywitanie(){
        System.out.println(przywitanie + " " + imie);
    }
}
