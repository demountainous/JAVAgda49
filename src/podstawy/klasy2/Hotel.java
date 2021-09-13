package podstawy.klasy2;

public class Hotel {
    private String name;
    private int iloscDostepnychMiejsc;

    /**
     * Kontruktor parametrowy
     * @param name
     * @param iloscDostepnychMiejsc
     */
    public Hotel(String name, int iloscDostepnychMiejsc){
        this.name = name;
        this.iloscDostepnychMiejsc = iloscDostepnychMiejsc;
    }

    /**
     * Kontruktor parametrowy
     * @param name
     */
    public Hotel(String name) {
        this.name = name;
    }

    /**
     * Kontruktor bezparametrowy
     */
    public Hotel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIloscDostepnychMiejsc() {
        return iloscDostepnychMiejsc;
    }

    public void setIloscDostepnychMiejsc(int iloscDostepnychMiejsc) {
        this.iloscDostepnychMiejsc = iloscDostepnychMiejsc;
    }
}
