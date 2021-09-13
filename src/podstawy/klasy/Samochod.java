package podstawy.klasy;

public class Samochod {
    private String color;
    private int przebieg = 0;
    private String marka;

    /**
     * Settery i Gettery sekcja
     */

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Koniec Sekcji Settery i Gettery
     */

    public boolean czyWybranyKolorJestPodstawowy(String kolor){
        return kolor.equals(this.color);
    }
}
